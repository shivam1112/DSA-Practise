class Solution {
    public int removeDuplicates(int[] nums) {
        int len =nums.length;
        int count =1;
        for(int i=1;i<len;i++){
            if(nums[i-1]==nums[i]){
                int temp =nums[i];
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[len-1]=temp;
                len--;
                i--;
            }
            else{
                count++;
            }
        }
        return count;        
    }
}