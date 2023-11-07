public class Vertex {
    public int id;
    public char color;
    Vertex pred;
    int dist;
    VertexList adj;

    //Constructor
    public Vertex(int id, char color, Vertex pred, VertexList adj){
        this.id = id;
        this.color = color;
        this.pred = pred;
        this.adj = adj;
    }

    public Vertex(){}

    //Methods
    public int findDist(){
        //distance from starting vertex
        Vertex travNode = this;
        int dist = 0;
        
        while(travNode.pred != null){
            dist++;
            travNode = travNode.pred;
        } 
        return dist;
    }

}
    
    