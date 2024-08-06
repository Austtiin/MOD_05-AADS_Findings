//Node.java
//Node class for the program
//
//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//


import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private final List<Node> dependencies;

    public Node(String name) {
        this.name = name;
        this.dependencies = new ArrayList<>();
    }

    public String grabName() {
        return name;
    }

    public List<Node> grabDependency() {
        return dependencies;
    }

    public void addDependency(Node node) {
        dependencies.add(node);
    }
}