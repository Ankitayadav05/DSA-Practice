import java.util.*;
public class firstocc {
  public static int firstocc(int arr[],int key,int idx){
    if(idx==arr.length){
      return -1;
    }
    if(arr[idx]==key){
      return idx;
    }
    return firstocc(arr,key,idx+1);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
  
  int key=sc.nextInt();
  System.out.println(firstocc(arr,key,0));
  }
}
