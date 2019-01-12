package graph;

public interface GraphInterface {
	
	/**
	 * Initialize graph
	 */
	void init();
	
	/**
	 * Get the number of nodes(vertices)
	 * 
	 * @return number of nodes in graph
	 */
	int numOfNodes();
	
	/**
	 * Get the number of outgoing edges
	 * of a node. The number of outgoing edges
	 * are same as the number of neighbors.
	 * 
	 * @param id the id of a node
	 * @return the number of edges (neighbors).
	 *         If there are no neighbors, return -1.
	 */
	int numOfEdges(int id);
	
	/**
	 * Add a node in the graph
	 * 
	 * @param id the id of the node
	 * @return if a node is added, it returns true.
	 *         if a node is not added because it exists already,
	 *         it returns false.
	 */
	boolean addNode(int id);
	
	/**
	 * Get the node with id
	 * 
	 * @param id id of the node
	 * @return the node.
	 *         If node with the id does not exist,
	 *         it returns null.
	 */
	Node getNode(int id);
	
	/**
	 * Add a directional edge between two nodes
	 * 
	 * @param fromId id of the node starting the edge
	 * @param toId id of the node ending the edge
	 * @return if an edge is added, it returns true.
	 * 		   if an edge is not added with other reasons,
	 *         it returns false.
	 *         The reasons can be
	 *         1) any node does not exist.
	 *         2) the edge already exist.
	 */
	boolean addEdge(int fromId, int toId);
	
	/**
	 * Remove a node from graph 
	 * It removes all edges of the node.
	 * 
	 * @param id id of the node to be removed
	 * @return if the node with id is removed correctly,
	 *         it returns true. Otherwise, it returns false.
	 */
	boolean removeNode(int id);
	
	/**
	 * Remove a directional edge between two nodes
	 * 
	 * @param fromId id of node starting the edge
	 * @param toId id of node ending the edge
	 * @return if edge id removed correctly, it returns true.
	 * 		   Otherwise, it returns false.
	 */
	boolean removeEdge(int fromId, int toId);
	
	/**
	 * Returns true if the directional edge
	 * exists between two nodes
	 * 
	 * @param fromId id of node starting the edge
	 * @param toId id of node ending the edge
	 * @return true if the edge exists between two nodes.
	 * 	       Otherwise, it returns false.
	 */
	boolean hadEdge(int fromId, int toId);
	
	/**
	 * Returns id of neighbors
	 * 
	 * @param id id of a node
	 * @return node ids of neighbors.
	 */
	Integer[] neighbors(int id);
	
	/**
	 * Return information of the graph
	 * 
	 * @return information of the graph
	 */
	String toString();
	
	/**
	 * Print information of the graph
	 */
	void show();
}
