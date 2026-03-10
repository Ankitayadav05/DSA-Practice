import java.util.*;

public class BuySellStocks {
  public static int BuySellStocks(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int msprofit=0;
    for(int i=0;i<prices.length;i++){
      if(prices[i]>buyprice){
        int profit=prices[i]-buyprice;
        msprofit=Math.max(msprofit,profit);
      }
      else{
        buyprice=prices[i];
      }
    }
    return msprofit;
  }
  public static void main(String args[]){
    int prices[]={7,1,5,3,6,4};
    System.out.println(BuySellStocks(prices));
  }
}
