class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] temp = nums.clone();
        int mid = (n + 1) / 2;
        int high = n;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0)
            nums[i] = temp[--mid];
            else
            nums[i] = temp[--high];
        }
    }
}
