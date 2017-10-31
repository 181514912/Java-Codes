/* 
 * Implements an algorithm to determine if a graph is 
 * two-colorable, that is if there is a 
 * coloring of the graph that uses no more than two colors. 
 * Also determine how many connected components there are. 
 *
 * Input Example:
 * 
 * in.txt
 * 1 2
 * 1 3
 * 2 3
 * 1 4
 * 0 5
 * 4 3
 * 3 0
 * 
 * Output example:
 * 
 * Is not two-colorable
 * 1 connected component(s)
 * 
 *
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Bipartite {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("NO Args");
			return;
		}

		String line = "";
		String temp = null;
		int[] input = null;
		String[] tokenized = null;

		try {
			FileReader fileReader = new FileReader(args[0]);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// While our BufferedReader has more lines to read
			// append them to our String
			while ((temp = bufferedReader.readLine()) != null) {
				line += temp;
				line += " ";
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException: " + args[0]);
		} catch (IOException ex) {
			System.out.println("IOException: " + args[0]);
		}
		tokenized = line.split(" ");

		if (tokenized.length < 2) {
			System.out.println("Error: Bad Edge List");
			return;
		}

		// Set our array to length of the tokenized String
		input = new int[tokenized.length];

		int max = 0; // Number of vertices = max int of input
		for (int i = 0; i < tokenized.length; i++) {
			// Traverse tokenized String and parse it into int for Array
			input[i] = Integer.parseInt(tokenized[i].trim());
			if (input[i] > max) {
				max = input[i];
			}
		}

		// The list of visited vertices
		Boolean[] visited = new Boolean[max + 1];

		// Make Graph and populate it with edges given
		Graph g = new Graph(visited);
		for (int i = 0; i < input.length; i += 2) {
			g.addEdge(input[i], input[i + 1]);
		}

		// Loop over visited array, calling DFS when 
		// vertices haven't been visited before (which also
		// increments the number of connected components)
		int connComp = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				g.DFS(i);
				connComp++;
			}
		}
		// Print results
		if (g.isBipartite()) {
			System.out.println("Is two-colorable");
		} else {
			System.out.println("Is not two-colorable");
		}
		System.out.println(connComp + " connected component(s)");
	}
	
	public static class Graph {
		private int vertices;
		private LinkedList<Integer>[] adjList;
		private Boolean[] visited;
		private int[] colors;
		private Boolean bipartite = true;

		public Graph(Boolean[] visited) {
			this.vertices = visited.length;
			this.adjList = new LinkedList[vertices];
			this.visited = visited;
			this.colors = new int[vertices];
			
			// Create unpopulated Adjacency List
			for (int i = 0; i < adjList.length; i++)
				adjList[i] = new LinkedList<Integer>();

			// Set all values of colors to -1 and visited to false
			for (int i = 0; i < vertices; i++) {
				colors[i] = -1;
				visited[i] = false;
			}
		}

		// Add edge to graph (our graphs are undirected)
		public void addEdge(int v, int w) {
			adjList[v].add(w);
			adjList[w].add(v);
		}

		// Return whether or not the Graph is bipartite
		public Boolean isBipartite() {
			return bipartite;
		}

		// Perform Depth-first Search
		public void DFS(int source) {
			// Stack is used to hold elements
			Stack<Integer> stack = new Stack<Integer>();
			int currColor = 1;
			int adjVert; 
			stack.push(source);

			// While elements in stack, keep popping and searching
			// adjacency lists for unvisited vertices
			while (stack.empty() == false) {
				// Pop top element off stack
				source = stack.pop();

				// If not colored, color current vertex
				// Update the current color for next vertex
				if (colors[source] == -1) {
					colors[source] = currColor;
					if (currColor == 1) {
						currColor = 2;
					} else if (currColor == 2) {
						currColor = 1;
					}
				}

				// If not visited yet, visit the current vertex
				if (visited[source] == false) {
					visited[source] = true;
				}

				// Iterate over current vertex's adjacency list
				for(int i = 0; i < adjList[source].size(); i++)
				{
					adjVert = adjList[source].get(i);
					// If this adjacent vertex is unvisited,
					// 1. Push it to stack
					// 2. Color it according to current source vertex
					if (!visited[adjVert]) {
						stack.push(adjVert);
						if (colors[adjVert] == -1) {
							if (colors[source] == 1) {
								colors[adjVert] = 2;
							} else if (colors[source] == 2) {
								colors[adjVert] = 1;
							}
						} else if (colors[adjVert] == colors[source]) {
							// If this adjacent vertex is already colored
							// and its color is the same as our current vertex's
							// color, our graph is not bipartite
							bipartite = false;
						}
					}
				}
			}
		}
	}
}