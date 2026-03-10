import java.util.*;
public class BinarySearch {
  public static int BinarySearch(int arr[],int key){
    int start=0;int last=arr.length-1;
    while(start<=last){
    int mid=(start+last)/2;
    if(arr[mid]==key){
      return mid;
    }
    if(key>arr[mid]){
      start=mid+1;
    }
    else{
      last=mid-1;
    }
    }
    return -1;
  }
  public static void main(String args[]){
    int arr[]={1,2,6,8,9};
    int key=8;
 System.out.println( BinarySearch(arr,key));
  }
}
