class Solution {
    public int maxSubArray(int[] nums) {
        int csum = nums[0], maxsum = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]>=nums[i]+csum)
            csum = nums[i];
            else
            csum = nums[i]+csum;
            if (csum>maxsum)
            maxsum = csum;
        }
        return maxsum;
    }
}
