class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length())
            return ans;
        int[] pCount = new int[26];
        int[] window = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pCount, window)){
                ans.add(i - p.length() + 1);
            }
        }
        return ans;
    }
}
