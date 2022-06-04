class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int a =Math.abs(nums[i])-1;
            if(nums[a]<0){
                return a+1;
            }
            nums[a]=-nums[a];
        }
        return 0;
    }
}