class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int x = 0;
        int max = 0;
        for (int y = 0; y < s.length(); y++) {
            while (set.contains(s.charAt(y))) {
                set.remove(s.charAt(x));
                x++;
            }
            set.add(s.charAt(y));
            if ((y-x)+1>max)
            max = (y-x)+1;
        }
        return max;
    }
}
