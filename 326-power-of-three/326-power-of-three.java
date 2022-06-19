class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }else if(n%2==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3==0 && isPowerOfThree(n/3)){
            return true;
        }else{
            return false;
        }
    }
}