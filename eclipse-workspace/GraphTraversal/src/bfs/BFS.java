package bfs;

import queue.*;
import java.util.*;

public class BFS {

	private Graph graph;
	private int srcId;
	private AQueue<Integer> queue;
	
	public BFS(Graph graph, int srcId) {
		
		ArrayList<Node> nodes = graph.nodes();
		this.graph = graph;
		this.srcId = srcId;
		System.out.println("BFS: find paths: # of nodes: " + nodes.size());
		
		// initial step
		for (Node node: nodes) {
			node.setColor(COLOR.WHITE);
			node.setDistance(Integer.MAX_VALUE);
			node.setParent(-1);
		}
		queue = new AQueue<Integer>(100);
		
		// visit source node
		Node srcNode = graph.getNode(srcId);
		srcNode.setColor(COLOR.GRAY);
		srcNode.setDistance(0);
		queue.enqueue(srcId);
		//queue.showAll(); // to check queue
		
		// visit all other nodes
		while (!queue.isEmpty()) {
			int id = queue.dequeue();
			//queue.showAll(); // to check queue
			
			Node node = graph.getNode(id);
			ArrayList<Integer> neighborIds = node.neighbors();
			for (Integer neighborId: neighborIds) {
				Node neighbor = graph.getNode(neighborId);
				if (neighbor.color() == COLOR.WHITE) {
					neighbor.setColor(COLOR.GRAY);
					neighbor.setParent(id);
					queue.enqueue(neighborId);
					//queue.showAll(); // to check queue
				}
			}
			node.setColor(COLOR.BLACK);
		}
	}
	
	public void printPath() {
		ArrayList<Node> nodes = graph.nodes();
		for (Node node: nodes) {
			System.out.print("node " + node.id() + ": ");
			String path = printPath(node);
			System.out.println(path);
		}
	}
	
	private String printPath(Node node) {
		// base case
		if (node.parent() == -1) {
			return String.valueOf(node.id());
		}
		
		// recursive general function
		return printPath(graph.getNode(node.parent()))
			+ " - " + String.valueOf(node.id());
	}
}
