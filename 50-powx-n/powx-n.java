class Solution {

    public static double helper(double x, int n){
        if(n==0) return 1;
        double temp = helper(x, n/2);
        temp = temp * temp;
        if(n%2!=0){
            return x*temp;
        }
        return temp;

    }
    public double myPow(double x, int n) {
        if(n<0){
            return 1 / helper(x, Math.abs(n));
        }else{
            return helper(x, n);
        }
    }
}