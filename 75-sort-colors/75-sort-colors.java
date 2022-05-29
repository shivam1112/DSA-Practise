class Solution {
    public void sortColors(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp =nums[i];
                nums[i] = nums[count];
                nums[count]=temp;
                count++;
            }
        }
        count = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==2){
                int temp =nums[i];
                nums[i] = nums[count];
                nums[count]=temp;
                count--;
            }
        }
    }
}