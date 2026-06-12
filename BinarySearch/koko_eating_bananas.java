class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int i = 0; i<piles.length; i++){
            if (piles[i]>r)
            r = piles[i];
        }
        while (l<r){
            int mid = l+(r-l)/2;
            long hours = 0;
            for (int i = 0; i<piles.length; i++){
                hours = hours+(piles[i]+mid-1)/mid;
            }
            if (hours <= h)
            r = mid;
            else
            l = mid+1;
        }
        return l;
    }
}
