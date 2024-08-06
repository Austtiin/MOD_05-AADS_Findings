//Tree.java
//Tree class for the program
//
//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//

//TWe utilized our previous modules to create a complete solution that implements the functionality developed in weeks 2, 3, and 4.
import java.util.*;

public class Tree {
    private Map<String, Node> nodes;

    public Tree() {
        nodes = new HashMap<>();
    }

    public void addNode(Node node) {
        nodes.put(node.grabName(), node);
    }

    public void addDependency(Node from, Node to) {
        from.addDependency(to);
    }

    public Map<String, Node> getNodes() {
        return nodes;
    }
}