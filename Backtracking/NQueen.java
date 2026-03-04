import java.util.*;

public class NQueen {
  public static boolean safe(char board[][],int row,int col){
  //veritically up
  for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
      return false;
    }
  }
  //vertically left 
  for(int i =row-1,j=col-1; i>=0 && j>=0 ;i--,j--){
    if(board[i][j]=='Q'){
    return false;
  }
}
  //vertically right
  for(int i=row-1,j=col+1; i>=0 && j <board.length;i--,j++ ){
    if(board[i][j]=='Q'){
      return false;
    }
  }
  return true;
  }
 public static void nqueen(char board[][],int row){
   if(row==board.length){
    printboard(board);
    return;
   }
   for(int j=0;j<board.length;j++){
    if(safe(board,row,j)){
      board[row][j]='Q';
      nqueen(board,row+1);
      board[row][j]='X';
    }
   }
 }
 public static void printboard(char board[][]){
  System .out.println("chess board ");
  for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
      System.out.print(board[i][j]+" ");
    }
    System.out.println();
  }
  System.out.println();
 }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char board[][]=new char[n][n];
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        board[i][j]='X';
      }
    }
    nqueen(board,0);
  }
  
}
