import java.util.*;

public class SelectionSort {
  public static void Selectionsort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      int minpos=i;
      for(int j=i;j<arr.length;j++){
        if(arr[minpos]>arr[j]){
          minpos=j;
        }
      }
      int temp=arr[minpos];
      arr[minpos]=arr[i];
      arr[i]=temp;
    }
  }
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]){
    int arr[]={13,46,24,52,20,9};
    Selectionsort(arr);
    print(arr);
  }
}
