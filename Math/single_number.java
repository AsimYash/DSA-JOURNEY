class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num))
            set.remove(num);
            else
            set.add(num);
        }
        for(int num : set)
        return num;
        return -1;
    }
}

//optimal soln - 

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums)
        ans ^= num;
        return ans;
    }
}
