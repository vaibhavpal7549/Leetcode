/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start <=  end){
            int guess_n = start + (end - start)/2;
            int val = guess(guess_n);
            if(val == 0){
                return guess_n;
            }else if(val == -1){
                end = guess_n-1;
            }else{
                start = guess_n+1;
            }

        }
        return -1;
        
    }
}