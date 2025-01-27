class Solution {
    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        if(ls != lt){
            return false;
        }
        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}