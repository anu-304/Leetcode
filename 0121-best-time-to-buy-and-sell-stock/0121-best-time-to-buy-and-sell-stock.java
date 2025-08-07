class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
                profit = prices[i] - min;
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}