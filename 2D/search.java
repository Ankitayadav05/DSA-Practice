import java.util.*;

public class search {
  public static boolean search(int arr[][],int key){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==key){
          return true;
        }
      }
    }
    System.out.print("not found");
      return false;
  }
  public static void main(String args[]){
    int arr[][]={{4,5,6},
                 {9,8,7}};
    int key=6;             
  System.out.println( search(arr,key));
  }
}
