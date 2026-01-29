import java.util.*;
public class prime {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num==2){
      System.out.print("Prime");
    }
    else{
      for(int i=2 ;i<=Math.sqrt(num);i++){
            if (num%i==0){
             System.out.println("not prime");
       }
           }
          }
    System.out.println("Prime");
        }
}