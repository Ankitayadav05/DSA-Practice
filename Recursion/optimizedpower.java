import java.util.*;

public class optimizedpower {
  public static int optimizedpower(int x,int n){
    if(n==0){
      return 1;
    }
    int halfpower=optimizedpower(x,n/2);
    int halfsqpower=halfpower*halfpower;
    if(n%2!=0){
      halfsqpower=halfsqpower*x;
    }
      return halfsqpower;
  }
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int power=sc.nextInt();
System.out.println(optimizedpower(num,power));
  }
}
