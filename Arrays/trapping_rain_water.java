class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water_units = 0;
        while (left < right){
            if (height[left] < height[right]){
                if (height[left] > leftMax)
                leftMax = height[left];
                else
                water_units = water_units+leftMax-height[left];
                left++;
            }
            else{
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                water_units = water_units+rightMax-height[right];
                right--;
            }
        }
        return water_units;
    }
}
