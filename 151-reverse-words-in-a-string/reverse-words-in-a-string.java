class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String words[] = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i =words.length - 1; i>=0; i--){
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
        
    }
}

// import java.util.Arrays;
// import java.util.Collections;

// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         String[] words = s.split("\\s+");
//         Collections.reverse(Arrays.asList(words));
//         return String.join(" ", words);
//     }
// }
