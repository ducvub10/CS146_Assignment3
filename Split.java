
public class Split {
public static void main(String graph) {
String[] edges = graph.split(";"); // split symbol
for (int i=0; i<edges.length; i++) {
//if input looks like "1,3" then
String[] parts = edges[i].split(","); //the split symbol
String part1 = parts[0]; //1
String part2 = parts[1]; //3
}
}
}
