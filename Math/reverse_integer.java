class Solution {
    public int reverse(int x) {
        long y = Math.abs((long)x), rev = 0;
        while (y>0){
            long a = y%10;
            rev = (rev*10)+a;
            y = y/10;
        }
        if (x<0)
        rev = -rev;
        if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        return 0;
        return (int)rev;
    }
}
