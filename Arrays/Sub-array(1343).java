class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int target = k*threshold;
        for (int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
            if (i >= k)
            sum = sum-arr[i-k];
            if (i >= k-1 && sum >= target)
            count++;
        }
        return count;
    }
}
