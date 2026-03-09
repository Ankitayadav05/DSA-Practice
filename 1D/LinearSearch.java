import java.util.*;

public class LinearSearch {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length of arr");
    int n=sc.nextInt();
    System.out.println("enter key");
    int k=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter no.s");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("check key exist or not");
    for(int i=0;i<arr.length;i++){
      if(arr[i]==k){
        System.out.println("fount at idx="+i);
      }
     
    }
  }
}
