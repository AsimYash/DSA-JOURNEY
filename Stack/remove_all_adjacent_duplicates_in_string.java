import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if (stack.isEmpty() == false && s.charAt(i) == stack.peek())
            stack.pop();
            else
            stack.push(s.charAt(i));
        }
        for (char ch : stack){
            st.append(ch);
        }
        return st.toString();
    }
}
