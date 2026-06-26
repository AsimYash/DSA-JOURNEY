class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int w : weights){
            l = Math.max(l, w);
            r += w;
        }
        while (l < r){
            int mid = l+(r-l)/2;
            int needDays = 1;
            int load = 0;
            for (int w : weights){
                if (load + w > mid){
                    needDays++;
                    load = 0;
                }
                load += w;
            }

            if (needDays <= days)
            r = mid;
            else
            l = mid + 1;
        }
        return l;
    }
}
