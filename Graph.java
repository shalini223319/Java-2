import java.util.*;
class Graph{
    private Map<string,list<string>>adjacencylist;
    public Graph(){
         adjacencylist=new HashMap <>();
    }
    public void AddVertex(String Vertex) {
         adjacencylist.put(vertex,new arraylist<> ());
    }
    public void addedge(String source,string destination){
         adjacencylist.get(source).add(destination);
         adjacencylist.get(destination).add(source);
    }
    public void dfs(String startvertex){
         set<string>visited=new HashSet <> ();
         dfs helper;(Startvertex,visited);
    }
    private void dfshelper(string vertex,set<string>visited){
         visited.add(vertex);
    System.out.print(vertex+"");
         for(string neighbour:adjacencylist.get(vertex)){
             if(! vistited.contains(neighbour)){
         dsfhelper(neighbour,visited);
                   }
             }
         }
     }
     public class main{
           public static void main(string[]args){
                  Graph graph=newGraph();
                  graph.addvertex("A");
      		  graph.addvertex("B");
   		  graph.addvertex("C");
		  graph.addvertex("D");
		  graph.addvertex("E");
                  graph.addedge("A","B");
                  graph.addedge("A","C");
                  graph.addedge("B","D");
        	  graph.addedge("C","E");
                  Sytem.out.println("depth-first traversal;");
                  graph.dsf("A");
    }
}










































