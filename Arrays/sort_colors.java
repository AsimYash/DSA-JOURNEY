class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        int [] ans = new int[nums.length];

        for (int i = 0; i<nums.length; i++){
            if (nums[i] == 0)
            red++;
            else if(nums[i] == 1)
            white++;
            else if(nums[i] == 2)
            blue++;
        }
        for(int i = 0; i<red; i++){
           ans[i] = 0;
        }
        for(int i = red; i<(red+white); i++){
           ans[i] = 1;
        }
        for(int i = red+white; i<(red+white+blue); i++){
           ans[i] = 2;
        }
        for (int i = 0; i<nums.length; i++){
            nums[i] = ans[i];
        }
    }
}
