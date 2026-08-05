class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int k = 0;
        int n = chars.length;
        while(i < n){
            int j = i;
            while(j <n && chars[j] == chars[i]){
                j++;
            }
            chars[k++] = chars[i];
            int count = j - i;
            if(count > 1){
                String str = String.valueOf(count);
                for(char ch: str.toCharArray()){
                    chars[k++] = ch;
                }
            }
            i = j;
        }
        return k;
    }
}