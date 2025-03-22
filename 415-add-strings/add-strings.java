import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // StringBuilder result = new StringBuilder();
        // int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        // while (i >= 0 || j >= 0 || carry > 0) {
        //     int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        //     int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
        //     int sum = digit1 + digit2 + carry;
            
        //     result.append(sum % 10);
        //     carry = sum / 10;
            
        //     i--;
        //     j--;
        // }
        
        // return result.reverse().toString();

        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger ans = n1.add(n2);
        return ans.toString();

    }
}