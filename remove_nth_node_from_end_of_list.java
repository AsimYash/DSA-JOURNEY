class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode ct = head, ctt = head;

        while (ct != null){
            ct = ct.next;
            c++;
        }
        if (c == n)
        return head.next;
        int x = 1;
        while (ctt != null && ctt.next != null){
            if (c-x == n){
                ctt.next = ctt.next.next;
                break;
        }
            ctt = ctt.next;
            x++;
        }
        return head;
    }
}
