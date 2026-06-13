class Solution {
    public int minElement(int[] nums) {
        int j,sum = 0;
        for (int i = 0; i<nums.length; i++){
            j = nums[i];
            while(j!=0){
                sum = sum+(j%10);
                j = j/10;
            }
            nums[i] = sum;
            sum = 0;
        }
        int min = nums[0];
        for (int i = 0; i<nums.length;i++){
            if (nums[i]<min)
            min = nums[i];
        }
        return min;
    }
}
