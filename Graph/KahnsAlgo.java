import java.util.*;

public class KahnsAlgo {
  static class Edge{
    int src;
    int dest;
    Edge(int s,int d){
      this.src=s;
      this.dest=d;
    }
  }
  static void create(ArrayList<Edge>graph[]){
    for(int i=0;i<graph.length;i++){
      graph[i]=new ArrayList<>();
    }
   //2 vertex
  graph[2].add(new Edge(2,3));
  //3 vertex
  graph[3].add(new Edge(3,1));
  //4 vertex
  graph[4].add(new Edge(4,0));
  graph[4].add(new Edge(4,1));
  //5 vertex
  graph[5].add(new Edge(5,0));
  graph[5].add(new Edge(5,2));
  }
  public static void calIndeg(ArrayList<Edge>graph[],int indeg[]){
    for(int i=0;i<graph.length;i++){
      int v=i;
      for(int j=0;j<graph[v].size();j++){
        Edge e=graph[v].get(j);
        indeg[e.dest]++;
      }
    }
  }
  public static void topsort(ArrayList<Edge>graph[]){
    int indeg[]=new int[graph.length];
    calIndeg(graph, indeg);
    Queue<Integer>q=new LinkedList<>();
    for(int i=0;i<indeg.length;i++){
      if(indeg[i]==0){
        q.add(i);
      }
    }
    while(!q.isEmpty()){
      int curr=q.remove();
      System.out.print(curr+" ");
      for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        indeg[e.dest]--;
        if(indeg[e.dest]==0){
          q.add(e.dest);
        }
      }
    }
    System.out.println();
  }
  public static void main(String args[]){
   int v=7;
   ArrayList<Edge>graph[]=new ArrayList[v];
   create(graph);
   topsort(graph);
  }
}
