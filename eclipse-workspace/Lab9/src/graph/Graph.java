package graph;

import java.util.*;

public class Graph implements GraphInterface {
	
	private ArrayList<Node> nodes;
	
	public Graph() {
		nodes = new ArrayList<Node>();
	}

	@Override
	public void init() {
		nodes = null;
		
	}

	@Override
	public int numOfNodes() {
		return nodes.size();
	}

	@Override
	public int numOfEdges(int id) {
		for (Node node: nodes) {
			if (id == node.id()) {
				return node.numOfNeighbors();
			}
		}
		return -1;
	}
	
	// check if the node exists.
	private boolean isNodeExist(int id) {
		for (Node node: nodes) {
			if (id == node.id()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addNode(int id) {
		if (isNodeExist(id)) {
			return false;
		}
		nodes.add(new Node(id));
		return true;
	}

	@Override
	public Node getNode(int id) {
		for (Node node: nodes) {
			if (id == node.id()) {
				return node;
			}
		}
		return null;
	}
	
	// return the index of node.
	private int getIndexById(int id) {
		int index = -1;
		for (Node node: nodes) {
			index++;
			if (id == node.id()) {
				return index;
			}
		}
		return index;
	}
	
	private boolean isEdgeExist(int fromId, int toId) {
		Node fromNode = getNode(fromId);
		if (fromNode != null) {
			if (fromNode.isEdgeExist(toId)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addEdge(int fromId, int toId) {
		// check if node with fromId exists
		if (!isNodeExist(fromId)) {
			return false;
		}
		
		// check if node with toId exists.
		if (!isNodeExist(toId)) {
			return false;
		}
		
		// check if the edge exists.
		if (isEdgeExist(fromId, toId)) {
			return false;
		}
		
		// add edge
		Node fromNode = getNode(fromId);
		fromNode.addNeighbor(toId);
		return true;
	}

	@Override
	public boolean removeNode(int id) {
		if (!isNodeExist(id)) {
			return false;
		}
		
		/* remove node */
		nodes.remove(getIndexById(id));
		
		/* remove edges connected to the node */
		int toId = id;
		for (Node node: nodes) {
			removeEdge(node.id(), toId);
		}
		
		return true;
	}

	@Override
	public boolean removeEdge(int fromId, int toId) {
		if (!isEdgeExist(fromId, toId)) {
			return false;
		}
		Node fromNode = getNode(fromId);
		return fromNode.removeEdge(toId);
	}

	@Override
	public boolean hadEdge(int fromId, int toId) {
		return isEdgeExist(fromId, toId);
	}

	@Override
	public Integer[] neighbors(int id) {
		Node node = getNode(id);
		return (Integer[])node.neighbors().toArray();
	}
	
	public String toString() {
		String ret = "";
		for (Node node: nodes) {
			ret += node.toString() + "\n";
		}
		return "# of nodes: " + numOfNodes() + "\n" + ret;
	}

	@Override
	public void show() {
		System.out.println(toString());
	}

}
