import java.util.*;

public class Graph {
    private int Vertex;
    LinkedList<Integer> adjacencyList[];

    @SuppressWarnings("unchecked")
    Graph(int v) {
        Vertex = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int e) {
        adjacencyList[v].add(e);
    }

    void BFS(int src) {

        boolean visitedNodes[] = new boolean[Vertex];
        Queue<Integer> q = new LinkedList<>();

        visitedNodes[src] = true;
        q.add(src);

        while (q.size() != 0) {
            src = q.poll();
            System.out.println(src + " ");

            Iterator<Integer> i = adjacencyList[src].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visitedNodes[n]) {
                    visitedNodes[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 2);

        System.out.println("Following is Breadth First Traversal");

        g.BFS(3);
    }
}
