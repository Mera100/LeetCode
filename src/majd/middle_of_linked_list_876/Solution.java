package majd.middle_of_linked_list_876;


class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        float size = 0;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        current = head;
        double middle = Math.ceil(size/2);
        while (middle > 0) {
            current = current.next;
            middle--;
        }
        return current;
    }
}
