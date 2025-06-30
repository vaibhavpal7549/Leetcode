class Solution {
    public String countAndSay(int n) {

        if(n==1) return "1";
        if(n==2) return "11";

        String result = countAndSay(n-1);

        StringBuilder newresult = new StringBuilder();

        int count = 1;
        for(int i = 1; i<result.length(); i++){
            if(result.charAt(i) != result.charAt(i-1)){
                newresult.append(count);
                newresult.append(result.charAt(i-1));
                count = 1;
            }else{
                count++;
            }

            if(i == result.length()-1){
                newresult.append(count);
                newresult.append(result.charAt(i));
            }


        }
        return newresult.toString();

        
    }
}