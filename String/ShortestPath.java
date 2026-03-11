import java.util.*;

public class ShortestPath {
  public static float ShortestPath(String str){
    int x=0;int y=0;
    for(int i=0;i<str.length();i++){
      char dir=str.charAt(i);
      if(str.charAt(i)=='N'){
          y++;
      }
      if(str.charAt(i)=='S'){
          y--;
      }
      if(str.charAt(i)=='E'){
          x++;
      }
      if(str.charAt(i)=='W'){
          x--;
      }
    }
    int x2=x*x;
    int y2=y*y;
    return (float) (Math.sqrt(x2+y2));
  }
  public static void main(String args[]){
   String str="WNEEESENNN";
   System.out.println(ShortestPath(str));
  }
}
