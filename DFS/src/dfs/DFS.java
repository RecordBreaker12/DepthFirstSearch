package dfs;

public class DFS {

    
    public static void main(String[] args) {
        //Criando grafo
        Grafo mapa = new Grafo();
        //Arad
        mapa.addNode(0, "Arad");
        mapa.addEdge(0, 1, "Zerind");
        mapa.addEdge(0, 2, "Sibui");
        mapa.addEdge(0, 3, "Timisoara");
        //Zerind
        mapa.addNode(1, "Zerind");
        mapa.addEdge(1, 0, "Arad");
        mapa.addEdge(1, 4, "Oradea");
        //Sibui
        mapa.addNode(2, "Sibui");
        mapa.addEdge(2, 0, "Arad");
        mapa.addEdge(2, 4, "Oradea");
        mapa.addEdge(2, 5, "Fagaras");
        mapa.addEdge(2, 6, "Rimnicu Vilcea");
        //Timisoara
        mapa.addNode(3, "Timisoara");
        mapa.addEdge(3, 0, "Arad");
        mapa.addEdge(3, 7, "Lugoj");
        //Oradea
        mapa.addNode(4, "Oradea");
        mapa.addEdge(4, 1, "Zerind");
        mapa.addEdge(4, 2, "Sibui");
        //Fagaras
        mapa.addNode(5, "Fagaras");
        mapa.addEdge(5, 2, "Sibui");
        mapa.addEdge(5, 8, "Bucharest");
        //Rimnicu Vilcea
        mapa.addNode(6, "Rimnicu Vilcea");
        mapa.addEdge(6, 2, "Sibui");
        mapa.addEdge(6, 9, "Craiova");
        mapa.addEdge(6, 10, "Pitesti");
        //Lugoj
        mapa.addNode(7, "Lugoj");
        mapa.addEdge(7, 3, "Timisoara");
        mapa.addEdge(7, 11, "Mehadia");
        //Bucharest
        mapa.addNode(8, "Bucharest");
        mapa.addEdge(8, 5, "Fagaras");
        mapa.addEdge(8, 10, "Pitesti");
        mapa.addEdge(8, 12, "Giurgiu");
        mapa.addEdge(8, 13, "Urziceni");
        //Craiova
        mapa.addNode(9, "Craiova");
        mapa.addEdge(9, 6, "Rimnicu Vilcea");
        mapa.addEdge(9, 10, "Pitesti");
        mapa.addEdge(9, 14, "Dobreta");
        //Pitesti
        mapa.addNode(10, "Pitesti");
        mapa.addEdge(10, 6, "Rimnicu Vilcea");
        mapa.addEdge(10, 8, "Bucharest");
        mapa.addEdge(10, 9, "Pitesti");
        //Mehadia
        mapa.addNode(11, "Mehadia");
        mapa.addEdge(11, 7, "Lugoj");
        mapa.addEdge(11, 14, "Dobreta");
        //Giurgiu
        mapa.addNode(12, "Giurgiu");
        mapa.addEdge(12, 8, "Bucharest");
        //Urziceni
        mapa.addNode(13, "Urziceni");
        mapa.addEdge(13, 8, "Bucharest");
        mapa.addEdge(13, 15, "Vaslui");
        mapa.addEdge(13, 16, "Hirsova");
        //Dobreta
        mapa.addNode(14, "Dobreta");
        mapa.addEdge(14, 9, "Craiova");
        mapa.addEdge(14, 11, "Mehadia");
        //Vaslui
        mapa.addNode(15, "Vaslui");
        mapa.addEdge(15, 13, "Urziceni");
        mapa.addEdge(15, 17, "Iasi");
        //Hirsova
        mapa.addNode(16, "Hirsova");
        mapa.addEdge(16, 13, "Urziceni");
        mapa.addEdge(16, 18, "Eforie");
        //Iasi
        mapa.addNode(17, "Iasi");
        mapa.addEdge(17, 15, "Vaslui");
        mapa.addEdge(17, 19, "Neamt");
        //Eforie
        mapa.addNode(18, "Eforie");
        mapa.addEdge(18, 16, "Hirsova");
        //Neamt
        mapa.addNode(19, "Neamt");
        mapa.addEdge(19, 17, "Iasi");
        mapa.dfs(0);
    }
    
}
