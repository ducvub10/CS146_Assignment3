public class TestProgram {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        System.out.println(graph.writeToString());
    }   
}
