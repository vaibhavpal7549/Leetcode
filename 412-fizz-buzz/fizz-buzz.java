class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans = new ArrayList<>();
        int idx = 0;
        while(idx<n){
            int pos = idx+1;
            if(pos%3 == 0 && pos%5 == 0){
                ans.add("FizzBuzz");
            }else if(pos%3==0){
                ans.add("Fizz");
            }else if(pos%5 == 0){
                ans.add("Buzz");
            }else{
                String t = String.valueOf(pos);
                ans.add(t);
            }

            idx++;
        }
        return ans;
    }
}