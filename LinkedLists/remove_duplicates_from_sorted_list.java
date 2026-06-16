class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode lst = head;
        while (lst != null && lst.next != null){
            if (lst.val == lst.next.val)
            lst.next = lst.next.next;
            else
            lst = lst.next;
        }
        return head;
    }
}
