class Solution {
    public void nextPermutation(int[] nums) {
        int [] ans = new int[nums.length];
        int pivote = 0;
        int secmin = 0;
        int k = 0,l = -1,m = 0;
        for (int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        for (int i = nums.length-2; i>=0; i--){
            if (ans[i]<ans[i+1]){
                pivote = ans[i];

                l = i;
                break;
            }
        }
        if (l == -1) {
        for (int i = 0; i < nums.length; i++) {
        nums[i] = ans[nums.length - 1 - i];
        }
        return;
        }
        for (int i = ans.length-1; i>l; i--){
            if (ans[i]>pivote){
                k = i;
                break;
            }
        }
        m = ans[l];
        ans[l] = ans[k];
        ans[k] = m;
        int n = 0;
        for (int i = 0; i<=l; i++){
            nums[i] = ans[n];
            n++;
        }
        for (int i = ans.length-1; i>l; i--){
            nums[n] = ans[i];
            n++;
        }
    }
}
