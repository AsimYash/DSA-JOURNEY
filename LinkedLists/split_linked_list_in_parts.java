class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while (curr != null){
            length++;
            curr = curr.next;
        }
        int partSize = length /k;
        int extra = length %k;
        ListNode[] ans = new ListNode[k];
        curr = head;
        for (int i = 0; i < k; i++){
            ans[i] = curr;
            int size = partSize;
            if (extra > 0){
                size++;
                extra--;
            }
            for (int j = 1; j < size && curr != null; j++)
            curr = curr.next;
            if (curr != null){
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }
        return ans;
    }
}
