class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int m = l + (r-l)/2;
            if (nums[m] == target) {
                first = m;
                r = m - 1;
            }
            else if (nums[m] < target)
            l = m + 1;
            else
            r = m - 1;
        }
        l = 0;
        r = nums.length-1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                last = m;
                l = m + 1;
            }
            else if (nums[m] < target)
            l = m + 1;
            else
            r = m - 1;
        }
        return new int[]{first, last};
    }
}
