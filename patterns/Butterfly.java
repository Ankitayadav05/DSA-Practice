import java.util.*;
public class Butterfly {
  public static void main(String args[]){
    int n=4;
    for(int i=1;i<=n;i++){
      //star
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      //space
      for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
      }
      //star
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=n;i>=1;i--){
      //star
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      //space
      for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
      }
      //star
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
