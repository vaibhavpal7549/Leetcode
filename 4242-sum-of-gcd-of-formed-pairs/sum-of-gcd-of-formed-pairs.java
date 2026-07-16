class Solution {

    public static long gcd(long a, long b){
        
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long pgcd[] = new long[n];

        int max = 0;
        for(int i = 0; i<n;i++){
            max = Math.max(max, nums[i]);
            pgcd[i] = gcd((long)nums[i], (long)max);
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