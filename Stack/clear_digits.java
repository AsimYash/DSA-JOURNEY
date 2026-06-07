class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()){
            if (stack.isEmpty() == false && (ch>='0' && ch<='9'))
            stack.pop();
            else
            stack.push(ch);
        }
        while(stack.isEmpty() == false)
        ans.append(stack.pop());
        return ans.reverse().toString();
    }
}
