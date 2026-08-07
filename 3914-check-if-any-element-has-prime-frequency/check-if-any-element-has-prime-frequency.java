class Solution {

    public static boolean isprime(int n){
        if (n <= 1) {
            return false;
        }


        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el: nums){
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for(int val: map.values()){
            if(isprime(val)) return true;
        }
        return false;
    }
}