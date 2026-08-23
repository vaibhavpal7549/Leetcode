class Solution {
    public boolean sumGame(String num) {
        int l = num.length();
        int h = l/2;
        int sum1 = 0;
        int sum2 = 0;
        int qR = 0;
        int qL = 0;
        boolean qq = false;

        
            
            for(int i = 0; i<h; i++){
                if(num.charAt(i) == '?'){
                    qL++;
                    qq = true;
                }else{
                sum1 += num.charAt(i) - '0';

                }

            }

            for(int i = h; i<l ;i++){
                if(num.charAt(i) == '?'){
                    qR++;
                    qq=true;
                }else{
                sum2 += num.charAt(i) - '0';

                }
            }
            if(qq == false){
                if(sum1==sum2) return false;
                else return true;
            }

            int tQ = qL+ qR;
            if(tQ%2 == 1) return true;

            int c1 = 2 * sum1 + 9 * qL;
            int c2 = 2 * sum2 + 9 * qR;

            if(c1 == c2)return false;
            return true;










        
    }
}