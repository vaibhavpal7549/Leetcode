class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        if(n ==1 || n==0) return n;
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int ans = 0;
        int len = 0;
        map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0) +1);

        for(int r = 1; r<n;  r++){
            char ch =  s.charAt(r);
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) +1);
            if(map.get(ch) <=2){
                len = r-l + 1;
                ans = Math.max(ans,len);
                continue;
                
            }else{
                while(true){
                    char ch1 =  s.charAt(l);
                    if(ch1 == s.charAt(r)){
                        map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) -1);
                        l++;
                        break;
                    }
                    map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) -1);
                    l++;
                }
            }

            


        }
        ans = Math.max(ans,len);

        return ans;



        
    }
}