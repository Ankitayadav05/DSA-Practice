import java.util.*;
public class LargestSmalllest {
  public static int LargestSmalllest(int arr[]){
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
        if(arr[i]<min){
          min=arr[i];
        }
      }
      System.out.println("max="+max);
      return min;
    }
  
  public static void main(String args[]){
  int arr[]={4,8,2,5,7};
  System.out.println(LargestSmalllest(arr));
  }
}
