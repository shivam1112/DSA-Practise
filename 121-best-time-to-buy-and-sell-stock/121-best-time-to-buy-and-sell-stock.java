class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        // int r=1;
        int max=0;
        for(int r=1;r<prices.length;r++){
            if(prices[l]>prices[r]){
                l++;
            }
            else if((prices[r]-prices[l])>max){
                max=prices[r]-prices[l];
            }
            if(prices[l]>prices[r]){
                l=r;
            }
        }
        return max;
    }
}