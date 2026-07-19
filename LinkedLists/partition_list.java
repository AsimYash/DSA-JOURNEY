class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode sd = new ListNode(0);
        ListNode ld = new ListNode(0);
        ListNode s = sd;
        ListNode l = ld;
        while (head != null){
            if (head.val < x){
                s.next = head;
                s = s.next;
            }
            else{
                l.next = head;
                l = l.next;
            }
            head = head.next;
        }
        l.next = null;
        s.next = ld.next;
        return sd.next;
    }
}
