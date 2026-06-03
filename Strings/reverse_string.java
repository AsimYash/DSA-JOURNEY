class Solution {
    public void reverseString(char[] s) {
        char ch;
        int x = 0;
        int y = s.length-1;
        while(x<y){
            ch = s[y];
            s[y] = s[x];
            s[x] = ch;
            x++;
            y--;
        }
    }
}
