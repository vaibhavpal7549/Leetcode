class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        

        String str = strs[0];
        int ch = str.length();
        for(int i = 1; i<strs.length; i++){
            int k = 0;
            int curr = 0;
            while(k < strs[i].length() && k < str.length()){
                
                if(strs[i].charAt(k) != str.charAt(k)){
                    break;
                }
                curr++;
                k++;
            }
            ch = Math.min(curr, ch);
        }

        return str.substring(0, ch);
    }
}