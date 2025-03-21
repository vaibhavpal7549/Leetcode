class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        String vowels = "aeiou";
        int count = 0;
        for(int i = left; i<=right; i++){
            String word = words[i];
            if(vowels.indexOf(word.charAt(0)) != -1 && (vowels.indexOf(word.charAt(word.length()-1)) != -1)){
                count++;
            }

        }
        return count;
        
    }
}