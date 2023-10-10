public class BestStockPick {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
//lkzfgl;kadfmglkam
    }
    public static int maxProfit(int[] prices) {
     if(prices.length < 2)return -1;
     int maxProfit = 0;
     int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            } else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;

            }

        }

     return maxProfit;
    }
}
