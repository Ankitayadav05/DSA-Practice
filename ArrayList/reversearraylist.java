import java.util.*;
public class reversearraylist {
  
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> list =new ArrayList<>();
   list.add(1);
 list.add(2);
 list.add(3);
 for(int i=list.size()-1;i>=0;i--){
  System.out.println(list.get(i));
 }

 }
}
