class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==0){
                for(int j=i;j<len-1;j++){
                   nums[j]=nums[j+1];
                }
                nums[len-1]=0;
                i--;
                len--;
            }
        }
    }
}