
public class Graph {
public VertexList vertices;

public Graph() {
    this.vertices = new VertexList();
}

public static Graph readFromString(String input) { //tested
    //split into edges  
    Graph graph = new Graph();

    
    String[] edges = input.split(";"); 

    
    for(int j = 0; j < edges.length; j++){
        //split edges to vertexes
        String[] parts = edges[j].split(","); 
        //add vertexes to graph
        Vertex currentVertex = graph.vertices.findOrMake(Integer.parseInt(parts[0]));
        currentVertex.adj.findOrMake(Integer.parseInt(parts[1]));
    }

    return graph;
}

public void addEdge(int i, int j) {
    this.vertices.findOrMake(i).adj.findOrMake(j);
}

public String writeToString() { //tested
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
        if (travNode.next != null){
        smallResult += ";";
        }
        result += smallResult; 
        travNode = travNode.next;
    }
    
    return result;
}
}
