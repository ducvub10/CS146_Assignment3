


public class VertexList {
    VertexNode head;
    
    public VertexList (VertexNode head){
        this.head = head;
    }

    //find or make a node with id i, then return vertex
    public Vertex findOrMake(int i) {
        VertexNode travNode = head;
        while (travNode != null){
            if (travNode.vertex.id == i){
                return travNode.vertex;
            }
            else if (travNode.next == null){
                break;
            }
            else{
                travNode = travNode.next;
            }
        }
        Vertex newVertex = new Vertex(i, 'w', null, null);
        travNode.next = new VertexNode(newVertex, null);
        return newVertex;
}
}
class VertexNode{
    Vertex vertex;
    VertexNode next;

    public VertexNode(Vertex vertex, VertexNode next){
        this.vertex = vertex;
        this.next = next;
    }
}

