class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        String str = s.trim();

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == ' '){
                len = 0;

            }

            else{
                len++;
            }

        }return len;
        
    }
}