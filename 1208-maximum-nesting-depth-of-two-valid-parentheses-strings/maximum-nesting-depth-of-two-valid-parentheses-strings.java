class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int d = 0;
        int ans[] =new int[seq.length()];
        int idx = 0;

        for(int i = 0; i<seq.length(); i++){
            char ch = seq.charAt(i);
            if(ch == '('){
                d += 1;
                if(d %2 !=0){
                    ans[idx++] = 1;
                }else{
                    ans[idx++] = 0;
                }
            }else{
                if(d %2 ==0){
                    ans[idx++] = 0;
                }else{
                    ans[idx++] = 1;
                }
                d -= 1;

            }
        }

        return ans;
    }
}