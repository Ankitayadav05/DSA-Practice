import java.util.*;
public class DecimalToBinary {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int decimal=sc.nextInt();
    int pow=0;
    int binary=0;
    while(decimal>0){
      int lastdigit=decimal%2;
      binary=binary+lastdigit*(int)Math.pow(10,pow);
      pow++;
      decimal=decimal/2;
    }
    System.out.println(binary);
  }
}
