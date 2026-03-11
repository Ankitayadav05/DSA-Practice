import java.util.*;

public class RotatedArray {
  public static int RotatedArray(int arr[],int si,int ei,int target){
    if(si>ei){
     return -1;
    }
    int mid=si+(ei-si)/2;
    if(arr[mid] == target){
      return mid;
    }
    if(arr[si]<=arr[mid]){
      if(arr[si]<=target && target<=arr[mid]){
        return RotatedArray(arr, si, mid-1, target);
      }
      else{
        return RotatedArray(arr, mid+1, ei, target);
      }
    }
    else{
      if(arr[mid]<=target && target<=arr[ei]){
        return RotatedArray(arr, mid+1, ei, target);
      }
      else{
        return RotatedArray(arr, si, ei, target);
      }
    }
  }
  
  
  public static void main(String args[]){
  int arr[]={4,5,6,7,0,1,2};
  int target=0;
  System.out.print(RotatedArray(arr, 0, arr.length-1, target));
  }
}
