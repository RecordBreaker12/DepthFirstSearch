package dfs;

import java.util.ArrayList;

public class Grafo {

    private final ArrayList<Node> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public void addNode(int num, String nome) {
        vertices.add(new Node(num, nome));
    }

    public void addEdge(int src, int dest, String nome) {
        vertices.get(src).adj.add(new Node(dest, nome));
    }

    public void dfs(int start) {
        boolean[] isVisited = new boolean[vertices.size()];
        dfsSearch(vertices.get(start), isVisited, 0);
    }

    private void dfsSearch(Node current, boolean[] isVisited, int profundidade) {
        isVisited[current.num] = true;
        visit(current.nome);
        for (Node dest : vertices.get(current.num).adj) {
            if (!isVisited[dest.num]){
                for(int i = 0; i<=profundidade; i++){
                    System.out.print(" ");
                }
                dfsSearch(dest, isVisited, profundidade + 1);
            }
        }
    }

    private void visit(String value) {
        System.out.println(" " + value);        
    }
}
