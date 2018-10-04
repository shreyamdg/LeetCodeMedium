package linkedlist;

public class DeleteNodefromValue {
	
	public static ListNode deletenode(ListNode head, int value) {
		
		if(head.val == value) {
			return head.next;
		}
		
		ListNode curr = head;
		while(curr.next != null) {
			if(curr.next.val == value) {
				if(curr.next!=null) {
					curr.next = curr.next.next;
					break;
				}else {
					curr.next = null;
					break;
				}
			}
			
			curr = curr.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		
		//ListNode n4 = new ListNode(3); ListNode n5 = new ListNode(3);
		 

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;  n4.next =n5; n5.next= n6; n6.next=null;

		/*
		 * ListNode m1 = new ListNode(1); ListNode m2 = new ListNode(3); ListNode m3 =
		 * new ListNode(4);
		 * 
		 * m1.next = m2; m2.next = m3; m3.next = null;
		 */

		ListNode deleted = deletenode(n1,3);
		System.out.println("hello");
	}
	

}
