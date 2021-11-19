package DataStructure;
import java.util.*;

public class Merge_2_Sorted_List {
	
	public class ListNode {
		  
	    int val;
	    ListNode next;
	  
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	  
	    ListNode(int val, ListNode next)
	    {
	        this.val = val;
	        this.next = next;
	    }
	}
	  
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	      ListNode head = new ListNode(0);
	    ListNode p=head;
	 
	    ListNode p1=l1;
	    ListNode p2=l2;
	    while(p1!=null && p2!=null){
	        if(p1.val < p2.val){
	            p.next = p1;
	            p1 = p1.next;
	        }else{
	            p.next = p2;
	            p2 = p2.next;
	        }
	        p=p.next;
	    }
	 
	    if(p1!=null){
	        p.next = p1;
	    }
	 
	    if(p2!=null){
	        p.next = p2;
	    }
	 
	    return head.next;
	   
	    }
	 public static void main(String[] args)
	    {
	        ListNode head1 = new ListNode(1);
	        head1.next = new ListNode(3);
	        head1.next.next = new ListNode(5);
	  
	        // 1->3->5 LinkedList created
	        ListNode head2 = new ListNode(0);
	        head2.next = new ListNode(2);
	        head2.next.next = new ListNode(4);
	  
	        // 0->2->4 LinkedList created
	        ListNode mergedhead = mergeTwoLists(head1, head2);
	  
	        printList(mergedhead);
	    }
	 static void printList(ListNode node)
	    {
	        while (node != null) {
	            System.out.print(node.val + " ");
	            node = node.next;
	        }
	    }
	  
	 }
