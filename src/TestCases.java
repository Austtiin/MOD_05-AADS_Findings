//TestCases.java
//TestCases class for the program
//
//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//
//We have not created a TestCases class to test the program in previous modules
//That is what we will do in this module/class
//Test cases must be ran separately to check if the program is working correctly
//
//
public class TestCases {
    public static void main(String[] args) {

        //Test cases, simple IF statements to check if the test cases pass or fail
        // Test case 1:
        // Simple linear dependency
        System.out.println("Test case 1: Simple linear dependency");
        if (testLinearDependency()) {
            System.out.println("Test case 1 passed.");
        } else {
            System.out.println("Test case 1 failed.");
        }

        // Test case 2:
        // Branching dependency
        System.out.println("Test case 2: Branching dependency");
        if (testBranchingDependency()) {
            System.out.println("Test case 2 passed.");
        } else {
            System.out.println("Test case 2 failed.");
        }

        // Test case 3:
        // Circular dependency
        System.out.println("Test case 3: Circular dependency");
        if (testCircularDependency()) {
            System.out.println("Test case 3 passed.");
        } else {
            System.out.println("Test case 3 failed.");
        }

        // Test case 4:
        // No dependencies
        System.out.println("Test case 4: No dependencies");
        if (testNoDependencies()) {
            System.out.println("Test case 4 passed.");
        } else {
            System.out.println("Test case 4 failed.");
        }

        // Test case 5:
        // Complex graph
        System.out.println("Test case 5: Complex graph");
        if (testComplexGraph()) {
            System.out.println("Test case 5 passed.");
        } else {
            System.out.println("Test case 5 failed.");
        }
    }



    //Test cases code
    //Test case 1:
    // Simple linear dependency
    private static boolean testLinearDependency() {
        //We need to create a tree and add nodes to it
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        tree.addNode(a);
        tree.addNode(b);
        tree.addDependency(a, b);
        //We need to create a DFS object and perform a depth first search
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        //We need to check if the node b was visited
        //If it was visited, the test case passes
        return dfs.isVisited(b);
    }


    //Test case 2:
    // Branching dependency

    private static boolean testBranchingDependency() {
        //We need to create a tree and add nodes to it
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        tree.addNode(a);
        tree.addNode(b);
        tree.addNode(c);
        tree.addDependency(a, b);
        tree.addDependency(a, c);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        //We need to check if the nodes b and c were visited
        //If they were visited, the test case passes
        return dfs.isVisited(b) && dfs.isVisited(c);
    }

    //Test case 3:
    // Circular dependency

    private static boolean testCircularDependency() {
        //We need to create a tree and add nodes to it
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        tree.addNode(a);
        tree.addNode(b);
        tree.addDependency(a, b);
        tree.addDependency(b, a);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        //We need to check if the node b was visited
        //If it was visited, the test case passes
        return dfs.isVisited(b);
    }


    //Test case 4:
    // No dependencies
    private static boolean testNoDependencies() {
        //We need to create a tree and add nodes to it again
        Tree tree = new Tree();
        Node a = new Node("A");
        tree.addNode(a);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);

        //We need to check if the node a was visited
        //If it was visited, the test case passes
        //Need to look at the node a to see if it was visited by the DFS because it has no dependencies
        return dfs.isVisited(a);
    }

    private static boolean testComplexGraph() {
        //We need to create a tree and add nodes to it
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        tree.addNode(a);
        tree.addNode(b);
        tree.addNode(c);
        tree.addNode(d);
        tree.addNode(e);
        tree.addNode(f);
        tree.addDependency(a, b);
        tree.addDependency(a, c);
        tree.addDependency(b, d);
        tree.addDependency(c, d);
        tree.addDependency(d, e);
        tree.addDependency(e, f);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);

        //We need to check if the nodes b, c, d, e, and f were visited
        //If they were visited, the test case passes
        //WE choose F as the last node to check if all the nodes were visited
        return dfs.isVisited(f);
    }
}