class Solution {
    public String convertToTitle(int columnNumber) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();

        
    while(columnNumber!=0){
        columnNumber -= 1;
        int rem = columnNumber %26;
        char ch = (char)('A' + rem);
        sb.append(ch);
        int a = columnNumber / 26;
        columnNumber = a;
    }
    return sb.reverse().toString();
    }

}