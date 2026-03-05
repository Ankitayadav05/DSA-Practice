import java.util.*;

public class Inorder {
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
      Newnode.left = Buildtree(Nodes);
      Newnode.right = Buildtree(Nodes);
      return Newnode;

    }
  }
  public static void postorder(Node root){
    if(root==null){
      return ;
    }
    postorder(root.left);
    System.out.print(root.data+" ");
    postorder(root.right);
  }
  public static void main(String args[]){
    int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Binarytree tree =new Binarytree();
     Node root = tree.Buildtree(Nodes);
     postorder(root);
  }
}
