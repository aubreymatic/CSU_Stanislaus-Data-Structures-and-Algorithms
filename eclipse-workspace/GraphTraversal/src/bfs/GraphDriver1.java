package bfs;

public class GraphDriver1 {

	public static void main(String[] args) {
		
		/* create a graph */
		Graph graph = new Graph();
		
		/* add nodes */
		int[] nodeIds = {1, 2, 3, 4, 5, 6 , 7, 8};
		for (int nodeId: nodeIds) {
			graph.addNode(nodeId);
		}
		
		/* add edges */
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		
		graph.addEdge(3, 2);
		
		graph.addEdge(4, 1);
		graph.addEdge(4, 5);
		graph.addEdge(4, 7);
		
		graph.addEdge(5, 6);
		graph.addEdge(5, 7);
		graph.addEdge(5, 4);
		
		graph.addEdge(6, 5);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);
		
		graph.addEdge(7, 4);
		graph.addEdge(7, 5);
		graph.addEdge(7, 6);
		graph.addEdge(7, 8);
		
		graph.addEdge(8, 6);
		graph.addEdge(8, 7);
		
		graph.show();
		
		// BFS
		int srcId = 1;
		BFS bfs = new BFS(graph, srcId);
		bfs.printPath();

	}

}
