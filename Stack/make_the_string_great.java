class Solution {
    public String makeGood(String s) {
        s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (stack.isEmpty() == false && (stack.peek()-ch == 32 || stack.peek()-ch == -32))
            stack.pop();
            else
            stack.push(ch);
        }
        for (char c : stack){
            st.append(c);
        }
        return st.toString();
    }
}
