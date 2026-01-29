import java.util.*;
public class printFact{
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    else{
    return n*factorial(n-1);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(factorial(num));
  }
}