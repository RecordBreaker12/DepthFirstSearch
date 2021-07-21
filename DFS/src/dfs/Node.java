package dfs;

import java.util.ArrayList;

public class Node {
    int num;
    String nome;
    ArrayList<Node> adj = new ArrayList<>();
    
    public Node(int num, String nome){
        this.num = num;
        this.nome = nome;
    }
}
