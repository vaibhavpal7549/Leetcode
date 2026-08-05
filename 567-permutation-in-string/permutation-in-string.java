class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int f1[] = new int[26];
        
        for(int i = 0; i<s1.length(); i++){
            int idx = s1.charAt(i) - 'a';
            f1[idx]++;

        }
        int f2[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            int idx1= s2.charAt(i) - 'a';
            f2[idx1]++;
        }
        if(Arrays.equals(f1, f2)){
            return true;
        }
        int k = 0;
        int r = s1.length();
        while(k <= s2.length()-s1.length() && r < s2.length()){
            int idx = s2.charAt(k) - 'a';
            f2[idx]--;
            int idx3 = s2.charAt(r) - 'a';
            f2[idx3]++;
            r++;
            k++;
            if(Arrays.equals(f1, f2)){
                return true;
            }
        }
        return false;
        
    }
}