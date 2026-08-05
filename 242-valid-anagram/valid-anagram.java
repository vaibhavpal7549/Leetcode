class Solution {
    public boolean isAnagram(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        if(s1 != t1) return false;

        char s2[] = s.toCharArray();
        char t2[] = t.toCharArray();

        Arrays.sort(s2);
        Arrays.sort(t2);

        return Arrays.equals(s2, t2);
    }
}