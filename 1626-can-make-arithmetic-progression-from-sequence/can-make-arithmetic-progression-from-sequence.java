class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean ans = true;
        int diff = arr[1] - arr[0];
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i+1] - arr [i] != diff){
                ans = false;
            }
        }
        return ans;
    }
}