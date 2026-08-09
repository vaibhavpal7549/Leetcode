class Solution {
    public String multiply(String s1, String s2) {
        
        boolean neg1 = false;
        boolean neg2 = false;
        
        if(s1.charAt(0) == '-'){
            neg1 = true;
            s1 = s1.substring(1);
        }
        
                
        if(s2.charAt(0) == '-'){
            neg2 = true;
            s2 = s2.substring(1);
        }
        
        int idx = 0;
        while (idx < s1.length() - 1 && s1.charAt(idx) == '0') {
            idx++;
        }
        s1 = s1.substring(idx);
        idx = 0;
        
        while (idx < s2.length() - 1 && s2.charAt(idx) == '0') {
            idx++;
        }
        s2 = s2.substring(idx);
        
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }
        
        int n = s1.length();
        int m = s2.length();
        
        int[] result = new int[n + m];
        
        for(int i = n-1; i>=0; i--){
            
            for(int j = m-1; j>=0; j--){
                
                int d1 = s1.charAt(i) - '0';
                int d2 = s2.charAt(j) - '0';
                
                int pos1 = i + j;
                int pos2 = i + j + 1;

                int product = d1 * d2 + result[pos2];

                result[pos2] = product % 10;
                result[pos1] += product / 10;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        int i = 0;
        
        while (i < result.length && result[i] == 0) {
            i++;
        }
        while (i < result.length) {
            ans.append(result[i]);
            i++;
        }
        
        if (neg1 != neg2) {
            ans.insert(0, '-');
        }
        
        return ans.toString();
        
        
        
    }
}