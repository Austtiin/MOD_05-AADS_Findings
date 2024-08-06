//main.java
// main class for the program

//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//

//Instructions

//Module 05 Content

//Module: 01
//Assignment: Read and review overall project Requirements

//Module: 02
//Assignment: Create a Java program that implements the stack data structure

//Module: 03
//Assignment: Create a Java program that builds a directed graph

//Module: 04
//Assignment: Create a Java program that performs a depth-first search to create a class compiling order

//Module: 05
//Assignment: Put together a complete solution that implements the functionality developed in weeks 2, 3, and 4
//
//Instructions:
//Now that we have completed the modules that make up our course project.
// put together a complete solution that implements the functionality developed in weeks 2, 3, and 4.
// Below are the requirements for the course project that were at the beginning of the project:
//
//
//
//You have been employed by an Open Source organization that develops and maintains Operating Systems.
// Your first project is to design a system with a data structure that will track all the modules for a specific OS along with their dependencies.
// Given the fact that whenever a module must be compiled or recompiled; all its dependent modules will need to be recompiled and in the correct order.
// Write a Java application that will, given an appropriate data structure, will be able to track these dependencies as well as implement an appropriate search algorithm
// to create the correct graph for any given module.
//The graph will show all the corresponding dependent modules in their correct order of dependency.
//
//        Provide at least 5 test cases and report your findings.

//we will utilize our previous modules to create a complete solution that implements the functionality developed in weeks 2, 3, and 4.
//We will create a Java program that implements the stack data structure, builds a directed graph, and performs a depth-first search to create a class compiling order.
//These will be put together to create a complete solution that will track all the modules for a specific OS along with their dependencies.
//The program will be able to track these dependencies as well as implement an appropriate search algorithm to create the correct graph for any given module.
//The graph will show all the corresponding dependent modules in their correct order of dependency.
//We will provide at least 5 test cases and report our findings.

//We have this structred from the previous modules and we will put them together to create a complete solution that will track all the modules for a specific OS along with their dependencies.
//Previous moduels have been supplied in other packages.
//

public class Main {
    public static void main(String[] args) {
        try {
            Tree tree = new Tree();

            // Create nodes
            Node a = new Node("A");
            Node b = new Node("B");
            Node c = new Node("C");
            Node d = new Node("D");
            Node e = new Node("E");
            Node f = new Node("F");

            // Add nodes to the tree
            tree.addNode(a);
            tree.addNode(b);
            tree.addNode(c);
            tree.addNode(d);
            tree.addNode(e);
            tree.addNode(f);

            // Add dependencies
            tree.addDependency(a, b);
            tree.addDependency(a, c);
            tree.addDependency(b, d);
            tree.addDependency(c, d);
            tree.addDependency(d, e);
            tree.addDependency(e, f);

            // Perform the depth-first search
            DFS dfs = new DFS();
            for (Node node : tree.getNodes().values()) {
                if (!dfs.isVisited(node)) {
                    dfs.depthFirstSearch(node);
                }
            }

            System.out.println("Finished the program.");
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("An error happened creating the tree...");
        }
    }
}