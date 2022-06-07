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
        // while(l<=prices.length-2){
        //     if(prices[l]>prices[r]){
        //         l++;
        //         r++;
        //     }
        //     else if((prices[r]-prices[l])>max){
        //         max=prices[r]-prices[l];
        //         r++;
        //     }
        //     if(r==prices.length-1){
        //         l++;
        //         r=l+1;
        //     }
        // }
        return max;
    }
}