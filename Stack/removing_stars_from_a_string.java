class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (stack.isEmpty() == false && ch == '*')
                stack.pop();
            else
            stack.push(ch);
        }
        while(stack.isEmpty() == false){
            st.append(stack.pop());
        }
        return st.reverse().toString();
    }
}
