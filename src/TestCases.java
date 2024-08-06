//TestCases.java
//TestCases class for the program
//
//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//

//
public class TestCases {
    public static void main(String[] args) {
        // Test case 1: Simple linear dependency
        System.out.println("Test case 1: Simple linear dependency");
        if (testLinearDependency()) {
            System.out.println("Test case 1 passed.");
        } else {
            System.out.println("Test case 1 failed.");
        }

        // Test case 2: Branching dependency
        System.out.println("Test case 2: Branching dependency");
        if (testBranchingDependency()) {
            System.out.println("Test case 2 passed.");
        } else {
            System.out.println("Test case 2 failed.");
        }

        // Test case 3: Circular dependency
        System.out.println("Test case 3: Circular dependency");
        if (testCircularDependency()) {
            System.out.println("Test case 3 passed.");
        } else {
            System.out.println("Test case 3 failed.");
        }

        // Test case 4: No dependencies
        System.out.println("Test case 4: No dependencies");
        if (testNoDependencies()) {
            System.out.println("Test case 4 passed.");
        } else {
            System.out.println("Test case 4 failed.");
        }

        // Test case 5: Complex graph
        System.out.println("Test case 5: Complex graph");
        if (testComplexGraph()) {
            System.out.println("Test case 5 passed.");
        } else {
            System.out.println("Test case 5 failed.");
        }
    }

    private static boolean testLinearDependency() {
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        tree.addNode(a);
        tree.addNode(b);
        tree.addDependency(a, b);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        return dfs.isVisited(b);
    }

    private static boolean testBranchingDependency() {
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
        return dfs.isVisited(b) && dfs.isVisited(c);
    }

    private static boolean testCircularDependency() {
        Tree tree = new Tree();
        Node a = new Node("A");
        Node b = new Node("B");
        tree.addNode(a);
        tree.addNode(b);
        tree.addDependency(a, b);
        tree.addDependency(b, a);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        return dfs.isVisited(b);
    }

    private static boolean testNoDependencies() {
        Tree tree = new Tree();
        Node a = new Node("A");
        tree.addNode(a);
        DFS dfs = new DFS();
        dfs.depthFirstSearch(a);
        return dfs.isVisited(a);
    }

    private static boolean testComplexGraph() {
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
        return dfs.isVisited(f);
    }
}