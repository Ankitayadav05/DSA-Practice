import java.util.*;
public class BINARYTODECIMAL {
 public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  int binarynumber=sc.nextInt();
  int pow=0;
  int decimalnumber=0;
  while(binarynumber>0){
    int lastdigit=binarynumber%10;
    decimalnumber=decimalnumber+lastdigit*(int)Math.pow(2,pow);
    pow++;
    binarynumber=binarynumber/10;
  }
  System.out.println(decimalnumber);
 }    
  }