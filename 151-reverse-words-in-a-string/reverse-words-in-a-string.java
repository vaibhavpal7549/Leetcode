class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        s = s.trim().replaceAll("\\s+", " ");
        StringBuilder ans = new StringBuilder();
        
        int j = s.length()-1;
        while(j >= 0){
            int i = j;
            
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            int k = i+1;
            while(k <= j){
                ans.append(s.charAt(k));
                k++;
            }    
            if(i>0){
                ans.append(' ');
            }
            j = i-1;        
        }
        return ans.toString();



    }
}