class Solution {
    public double Pow(double x, long n){
        if(n==0){
            x=x/x;
            return x;
        }else if(n==1){
            return x;
        }else if(n<0){
            return Pow(1/x,-n);
        }
        if(n%2==0){
            double p = Pow(x*x,n/2);
            return p;
        }else{
            double p = Pow(x*x,n/2);
            return p*x;
        }
    }
    public double myPow(double x, int n) {
        return Pow(x,n);
    }
}