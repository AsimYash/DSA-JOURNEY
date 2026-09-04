class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) 
        last[s.charAt(i) - 'a'] = i;
        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (used[index])
            continue;
            while (!stack.isEmpty() &&
                   stack.peek() > c &&
                   last[stack.peek() - 'a'] > i)
            used[stack.pop() - 'a'] = false;
            stack.push(c);
            used[index] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : stack)
        ans.append(c);
        return ans.toString();
    }
}
