public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l <= r){
            int m = l+(r-l)/2;
            int result = guess(m);
            if (result == 0)
            return m;
            else if (result == 1)
            l = m+1;
            else 
            r = m-1;
        }
        return -1;
    }
}
