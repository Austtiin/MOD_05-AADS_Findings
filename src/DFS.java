import java.util.*;

public class DFS {
    private Set<Node> visited;

    public DFS() {
        visited = new HashSet<>();
    }

    public boolean isVisited(Node node) {
        return visited.contains(node);
    }

    public void depthFirstSearch(Node node) {
        if (isVisited(node)) {
            return;
        }
        visited.add(node);
        System.out.println("Visiting node: " + node.grabName());
        for (Node dependency : node.grabDependency()) {
            depthFirstSearch(dependency);
        }
    }
}