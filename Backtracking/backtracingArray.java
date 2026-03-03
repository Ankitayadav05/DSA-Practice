import java.util.*;
public class backtracingArray {
  public static void backtrack(int arr[],int i,int val){
    if(i==arr.length){
      printarr(arr);
      return;
    }
    arr[i]=val;
    backtrack(arr,i+1,val+1);
    arr[i]=val-2;
  }
  public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    backtrack(arr, 0, 1);
    printarr(arr);
    }
  }
