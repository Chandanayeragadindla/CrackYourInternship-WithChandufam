Leetcode 121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] arr) {
     int  minPrice = arr[0];
     int maxProfit = 0;
     for(int i=1;i<arr.length;i++){
         int currentProfit = arr[i] - minPrice;
         maxProfit = Math.max(maxProfit, currentProfit); 
            minPrice = Math.min(minPrice, arr[i]);
     }
     return maxProfit;
    }
}
