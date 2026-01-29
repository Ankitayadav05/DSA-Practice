import java.util.*;

public class sortedornot {
  public static boolean sorted(int arr[],int idx){
    if(idx==arr.length-1){
      return true;
    }
    if(arr[idx]>arr[idx+1]){
      return false;
    }
    
      return sorted(arr,idx+1);
  
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }     
    System.out.println(sorted(arr,0));  

  }
}
