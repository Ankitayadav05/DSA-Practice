import java.util.*;
public class subset {
  public static void subset(String str,String ans,int i){
    if(i==str.length()){
      if(ans.length()==0){
         System.out.println("null");
      }
      else{
        System.out.println(ans);
      }
      return;
    }
    subset(str,ans+str.charAt(i),i+1);//added in ans
    subset(str,ans,i+1);//not added in ans 
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str="abc";
    String ans=" ";
    subset(str," ",0);
  }
  
}
