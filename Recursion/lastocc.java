import java.util.*;

public class lastocc {
  public static int lastocc(int arr[],int key,int idx){
    if(idx==arr.length){
      return -1;
    }
    int isFound=lastocc(arr,key,idx+1);
    if(isFound==-1 && arr[idx]==key){
      return idx;
    }
    return isFound;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    System.out.println(lastocc(arr,key,0));
  }

}
