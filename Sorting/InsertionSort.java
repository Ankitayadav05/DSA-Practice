import java.util.*;

public class InsertionSort {
  public static void insertionSort(int arr[]){
    for(int i=0;i<=arr.length-1;i++){
      int j=i;
      while(j>0 && arr[j-1]>arr[j]){
        int temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
      }
    }

  }
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]){
   int arr[]={14,9,15,12,6,8,13};
   insertionSort(arr);
   print(arr);
  }
}
