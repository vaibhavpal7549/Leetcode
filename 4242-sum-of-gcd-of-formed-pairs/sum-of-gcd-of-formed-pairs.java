class Solution {

    public static int gcd(int a, int b){
        
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int pgcd[] = new int[n];

        int mxi[] = new int[n];
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max, nums[i]);
            mxi[i] = max;
        }

        for(int i = 0; i<n;i++){
            pgcd[i] = gcd(nums[i], mxi[i]);
        }

        Arrays.sort(pgcd);
        long sum = 0;

        int l = 0;
        int r = n-1;
        while(l<r){
            sum += gcd(pgcd[l], pgcd[r]);
            l++;
            r--;
        }
        return sum;


    }
}