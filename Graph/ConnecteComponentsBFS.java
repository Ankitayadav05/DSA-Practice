import java.util.*;

public class ConnecteComponentsBFS {
  static class Edge{
    int src;
    int dest;
    int wt;
    Edge(int s,int d,int w){
      this.src=s;
      this.dest=d;
      this.wt=w;
    }
  }
  static void create(ArrayList<Edge>graph[]){
    for(int i=0;i<graph.length;i++){
      graph[i]=new ArrayList<>();
    }
    //0 vertex
    graph[0].add(new Edge(0,1,1));
    graph[0].add(new Edge(0,2,1));
    //1 vertex
    graph[1].add(new Edge(1,0,1));
    //2vertex
    graph[2].add(new Edge(2,0,1));
    graph[2].add(new Edge(2,3,1));
    //3vertex
    graph[3].add(new Edge(3,2,1));
    //4
    graph[4].add(new Edge(4,5,1));
    //5
    graph[5].add(new Edge(5,4,1));
    graph[5].add(new Edge(5,6,1));
    //6
    graph[6].add(new Edge(6,5,1));
  }
  public static void BFS(ArrayList<Edge>graph[]){
    boolean vis[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
      if(!vis[i]){
        BFSutil(graph,vis,i);
      }
    }
  }
  public static void BFSutil(ArrayList<Edge>graph[],boolean vis[],int src){
   Queue<Integer>q=new LinkedList<>();
   q.add(src);
   while(!q.isEmpty()){
    int curr=q.remove();
    if(!vis[curr]){
      System.out.print(curr+" ");
      vis[curr]=true;
      for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        q.add(e.dest);
      }
    }
   }
  }
  public static void main(String args[]){
  int v=7;
  ArrayList<Edge>graph[]=new ArrayList[v];
  create(graph);
  BFS(graph);
  }
}
