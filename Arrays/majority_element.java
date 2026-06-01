class Solution {
    public int majorityElement(int[] nums) {
       int majele = 0;
       int count = 0;
       for (int num : nums){
            if (count == 0)
            majele = num;
            if (num == majele)
            count++;
            else
            count--;
       }
       return majele;
    }
}
