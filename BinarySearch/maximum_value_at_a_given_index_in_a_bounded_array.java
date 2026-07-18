class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int low = 1;
        int high = maxSum;
        while (low < high){
            int mid = low+(high-low+1)/2;
            long left = helper(mid, index);
            long right = helper(mid, n-index-1);
            long total = left+right+mid;
            if (total <= maxSum)
            low = mid;
            else
            high = mid-1;
        }
        return low;
    }
    private long helper(long peak, int l){
        if (peak > l){
            long first = peak-l;
            long last = peak-1;
            return (first+last)*l/2;
        }
        long dec = (peak-1)*peak/2;
        long ones = l-(peak-1);
        return dec+ones;
    }
}
