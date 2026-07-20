class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            while (stack.isEmpty() == false &&
                   list.get(i) > list.get(stack.peek())){
                ans[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}
