class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                int idx = ch - 'a';
                sum += weights[idx];
            }

            int mod = sum % 26;
            char ch1 = (char) ('z' - mod);
            ans += ch1;
        }

        return ans;
    }
}