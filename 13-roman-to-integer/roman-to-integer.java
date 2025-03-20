class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanmap = new HashMap<>();
        romanmap.put('I', 1);
        romanmap.put('V', 5);
        romanmap.put('X', 10);
        romanmap.put('L', 50);
        romanmap.put('C', 100);
        romanmap.put('D', 500);
        romanmap.put('M', 1000);

        int res = 0;
        for(int i = 0; i<s.length(); i++){
            if(i+1 <s.length() && romanmap.get(s.charAt(i)) < romanmap.get(s.charAt(i+1))){
                res += romanmap.get(s.charAt(i+1)) - romanmap.get(s.charAt(i));

                i++;
            }else{
                res += romanmap.get(s.charAt(i));
            }


        }
        return res;
        
    }
}