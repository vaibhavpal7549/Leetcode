class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        ArrayList<Integer> ans= new ArrayList<>();
    
        for(int i = 0; i<9; i++){
            for(int j = i + 1; j<9; j++){
                String str = s.substring(i, j+1);

                int curr = Integer.parseInt(str);

                if(curr >= low && curr <= high ){
                    ans.add(curr);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}