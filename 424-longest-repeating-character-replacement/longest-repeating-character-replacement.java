class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int maxW = 0;
        int maxF = 0;
        int freq[] = new int[26];
        for(int right = 0; right<n ;right++){

            freq[s.charAt(right) - 'A']++;

            maxF = Math.max(maxF, freq[s.charAt(right) - 'A']);

            int wLength =  right - left + 1;

            if((wLength-maxF) > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            wLength = right - left + 1;
            maxW = Math.max(maxW, wLength);

        }


        return maxW;
    }
}