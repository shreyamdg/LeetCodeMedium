package linkedlist;

public class DeleteNodefromValue {

	public static ListNode deletenode(ListNode head, int value) {

		if (head.val == value) {
			return head.next;
		}

		ListNode curr = head;
		while (curr.next != null) {
			if (curr.next.val == value) {
				if (curr.next != null) {
					curr.next = curr.next.next;
					break;
				} else {
					curr.next = null;
					break;
				}
			}

			curr = curr.next;
		}

		return head;
	}

}
