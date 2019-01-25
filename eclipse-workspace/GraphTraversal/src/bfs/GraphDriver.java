package bfs;

public class GraphDriver {

	public static void main(String[] args) {
		
		/* create a graph */
		Graph graph = new Graph();
		
		/* add nodes */
		int[] nodeIds = {1, 2, 3, 4, 5};
		for (int nodeId: nodeIds) {
			graph.addNode(nodeId);
		}
		
		/* add edges */
		graph.addEdge(1, 2);
		graph.addEdge(1, 5);
		
		graph.addEdge(2, 1);
		graph.addEdge(2, 5);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		
		graph.addEdge(4, 5);
		graph.addEdge(4, 2);
		graph.addEdge(4, 3);
		
		graph.addEdge(5, 1);
		graph.addEdge(5, 2);
		graph.addEdge(5, 4);
		
		graph.show();
	}

}
