import java.util.*;
class reverseno{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while(num>0){
      int lastdigit=num%10;
      num=num/10;
      System.out.print(lastdigit);
    }
  
  }
}