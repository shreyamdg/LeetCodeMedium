package linkedlist;


public class RemoveNthNodeFromEnd {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
	    
	    ListNode start = new ListNode(0);
	    ListNode slow = start, fast = start;
	    slow.next = head;
	    
	    //Move fast in front so that the gap between slow and fast becomes n
	    for(int i=1; i<=n+1; i++)   {
	        fast = fast.next;
	    }
	    //Move fast to the end, maintaining the gap
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    //Skip the desired node
	    slow.next = slow.next.next;
	    return start.next;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		/*
		 * ListNode n4 = new ListNode(3); ListNode n5 = new ListNode(3);
		 */

		n1.next = n2;
		n2.next = n3;
		n3.next = null; // n4.next =n5; n5.next= null;

		/*
		 * ListNode m1 = new ListNode(1); ListNode m2 = new ListNode(3); ListNode m3 =
		 * new ListNode(4);
		 * 
		 * m1.next = m2; m2.next = m3; m3.next = null;
		 */

		ListNode deleted = removeNthFromEnd(n1,1);
	}
}
