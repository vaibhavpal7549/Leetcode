class Solution {
    public boolean isAnagram(String s, String t) {
        int f1[] = new int[26];
        int f2[] = new int[26];

        for(int i = 0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            f1[idx]++;
        }

        for(int i = 0; i<t.length(); i++){
            int idx = t.charAt(i) - 'a';
            f2[idx]++;
        }
        if(Arrays.equals(f1, f2)){
            return true;
        }else{
            return false;
        }
    }
}