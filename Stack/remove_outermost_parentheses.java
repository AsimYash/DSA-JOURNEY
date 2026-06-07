import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (ch == '('){
                if (stack.isEmpty() == false)
                st.append(ch);
                stack.push(ch);
            }
            else{
                stack.pop();
                if (stack.isEmpty() == false)
                st.append(ch);
            }
        }
        return st.toString();
    }
}
