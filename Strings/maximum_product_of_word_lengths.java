class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        for (int i = 0; i < n; i++){
            for (char c : words[i].toCharArray()) {
                int bit = c - 'a';
                masks[i] |= (1 << bit);
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    int product =
                        words[i].length() * words[j].length();
                    answer = Math.max(answer, product);
                }
            }
        }
        return answer;
    }
}
