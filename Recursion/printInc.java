import java.util.*;
public class printInc{
  public static void printInc(int n){
    if(n==1){
      System.out.println(1);
      return;
    }
  
    printInc(n-1);
    System.out.println(n);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    printInc(num);
  }
}