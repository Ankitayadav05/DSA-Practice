import java.util.*;

public class SearchBST {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static Node insert(Node root,int Val){
    if(root==null){
      root=new Node(Val);
      return root;
    }
    if(root.data>Val){
      root.left=insert(root.left,Val);
    }
    else{
      root.right=insert(root.right,Val);
    }
    return root;
  }
  public static boolean Binarysearch(Node root,int key){
    if(root==null){
      return false;
    }
    if(root.data==key){
      return true;
    }
    if(root.data>key){
      return Binarysearch(root.left,key);
    }
    else{
      return Binarysearch(root.right,key);
    }
  }
  public static void main(String args[]){
  int values[]={5,1,3,4,2,3};
  Node root=null;
  for(int i=0;i<values.length;i++){
    root=insert(root,values[i]);
  }
  if (Binarysearch(root, 1)){
    System.out.println("found");
  }
  else{
    System.out.println("Not found");
  }
  }
}
