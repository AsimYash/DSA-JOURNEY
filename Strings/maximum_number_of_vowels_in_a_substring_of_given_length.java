class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            if (isVowel(s.charAt(i)))
            c++;
            if (i >= k && isVowel(s.charAt(i-k)))
            c--;
            max = Math.max(max, c);
        }
        return max;
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
