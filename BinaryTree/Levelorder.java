import java.util.*;

public class Levelorder {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  static class Binarytree{
    static int idx=-1;
    public static Node Buildtree(int Nodes[]){
      idx++;
      if(Nodes[idx]==-1){
        return null;
      }
      Node Newnode=new Node(Nodes[idx]);
      Newnode.left=Buildtree(Nodes);
      Newnode.right=Buildtree(Nodes);
      return Newnode;
    }
  }
  public static void Levelorder(Node root){
    if(root==null){
      return;
    }
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    q.add(null);//for next line
    while(!q.isEmpty()){
      Node currnode=q.remove();
      if(currnode ==null){
        System.out.println();
      
      if(q.isEmpty()){
        break;
      }
      else{
        q.add(null);
      }
      }
    else{
      System.out.print(currnode.data+" ");
      if(currnode.left!=null){
        q.add(currnode.left);
      }
      if(currnode.right!=null){
        q.add(currnode.right);
      }
    }
    }
  }
public static void main(String args[]){
  int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
  Binarytree tree=new Binarytree();
  Node root=tree.Buildtree(Nodes);
  Levelorder(root);
}
}
