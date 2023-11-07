
public class Graph {
public VertexList vertices;
public static Graph readFromString(String input) {
    //iterate through input
    Graph graph = new Graph();
    graph.vertices = new VertexList(new VertexNode(null, null));

    //translate string to graph
    String[] edges = input.split(";"); // split symbol


    for(int j = 0; j < edges.length; j++){
        String[] parts = edges[j].split(","); //the split symbol
        Vertex currentVertex = graph.vertices.findOrMake(Integer.parseInt(parts[0]));
        currentVertex.adj.findOrMake(Integer.parseInt(parts[1]));
    }

    return graph;
}

public void addEdge(int i, int j) {
    this.vertices.findOrMake(i).adj.findOrMake(j);
}

public String writeToString() {
    VertexNode travNode = vertices.head;
    String result = "";

    while(travNode != null){
        String smallResult = "";
        smallResult += travNode.vertex.id;
        smallResult += ":";
        VertexNode travNode2 = travNode.vertex.adj.head;
        while(travNode2 != null){
            smallResult += travNode2.vertex.id;
            if(travNode2.next != null){
                smallResult += ",";
            }
            travNode2 = travNode2.next;
        }
        smallResult += ";";
        result += smallResult; 
    }
    
    return result;
}
}
