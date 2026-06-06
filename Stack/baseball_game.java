class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String o : operations){
            if (o.equals("+")){
                int x = stack.pop(), y = stack.peek()+x;
                stack.push(x);
                stack.push(y);
            }
            else if (o.equals("D"))
            stack.push(stack.peek()*2);
            else if (o.equals("C"))
            stack.pop();
            else
            stack.push(Integer.parseInt(o));
        }
        while (stack.isEmpty() == false){
            sum = sum+stack.pop();
        }
        return sum;
    }
}
