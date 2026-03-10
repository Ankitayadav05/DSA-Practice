import java.util.*;
public class Reverse {
  public static void reverse(int arr[]){
    int start=0;int end=arr.length-1;
    while(start<end){
      int tem=arr[end];
      arr[end]=arr[start];
      arr[start]=tem;
    
    start++;
    end--;
  }
}
  
  public static void main(String args[]){
  int arr[]={2,4,6,8};
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
 reverse(arr);
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
  }
}
