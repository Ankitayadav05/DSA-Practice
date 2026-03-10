import java.util.*;
public class InvertedRotatedHalfPyramid {
  public static void main(String args[]){
    int n=4;
    for(int i=1;i<=n;i++){
      //space
      for(int j=1;j<=n-i;j++){
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
