//DFS.java
//This is the DFS class that will be used to perform the depth-first search on the graph.

//We grabbed this code from the previous module and we will use it to perform the depth-first search on the graph.

import java.util.*;

public class DFS {
    private Set<Node> visited;

    // Constructor
    // We will create a new HashSet to store the visited nodes.
    public DFS() {
        visited = new HashSet<>();
    }

    // Method to check if a node has been visited
    public boolean isVisited(Node node) {
        return visited.contains(node);
    }


    // Method to perform the depth-first search
    // We will perform the depth-first search on the graph.
    public void depthFirstSearch(Node node) {
        //Here first we will check if the node has been visited.
        if (isVisited(node)) {
            return;
        }

        //If the node has not been visited, we will add it to the visited set and print out the node name.
        visited.add(node);

        //We will then iterate through the dependencies of the node and perform the depth-first search on each dependency.
        System.out.println("Visiting node: " + node.grabName());

        //Then we will recursively call the depthFirstSearch method on each dependency.
        for (Node dependency : node.grabDependency()) {
            depthFirstSearch(dependency);
        }
    }
}