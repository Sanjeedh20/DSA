//package LinkedList;
//
//public class LinkedListQuestions {
//	
//	Find the linked list node that the cyclic is started:
//		1)check whether list is cyclic or not.
//		2)find the length.
//		3)traverse the first node upto the length.
//		4)traverse both the node until it meets.
//		5)Return the meeting node
//
//		public class Solution {
//		    public ListNode detectCycle(ListNode head) {
//		        ListNode fast=head;
//		        ListNode slow=head;
//		        int length=0;
//		        while(fast!=null && fast.next!=null){
//		            fast=fast.next.next;
//		            slow=slow.next;
//		            if(fast==slow){
//		                ListNode temp=slow;
//		                do{
//		                    temp=temp.next;
//		                    length++;
//		                }while(temp!=slow);
//		                break;
//		            }
//		        }
//		        if(length==0){
//		            return null;
//		        }
//		        ListNode f=head;
//		        ListNode s=head;
//		        while(length>0){
//		            s=s.next;
//		            length=length-1;
//		        }
//		        while(s!=f){
//		            s=s.next;
//		            f=f.next;
//		        }
//		        return s;
//		    }
//		}
//		
//		Find middle element of the list:
//		public ListNode middleNode(ListNode head) {
//	        ListNode f=head;
//	        ListNode s=head;
//	        while(f!=null && f.next!=null){
//	            f=f.next.next;
//	            s=s.next;
//	        }
//	        return s;
//	    }
//		
//		 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		        ListNode dummyhead=new ListNode();
//		        ListNode tail=dummyhead;
//		        while(list1!=null && list2!=null){
//		            if(list1.val <list2.val){
//		                tail.next=list1;
//		                list1=list1.next;
//		                tail=tail.next;
//		            }
//		            else{
//		                tail.next=list2;
//		                list2=list2.next;
//		                tail=tail.next;
//		            }
//		        }
//		        while(list1!=null){
//		            tail.next=list1;
//		            list1=list1.next;
//		            tail=tail.next;
//		        }
//		        while(list2!=null){
//		            tail.next=list2;
//		            list2=list2.next;
//		            tail=tail.next;
//		        }
//		        return dummyhead.next;
//		    }
//		 
//		 Reversing of linked list:
//
//			public void reverserecursive(Node node){
//			         if(node==tail){
//			             head=tail;
//			             return;
//			         }
//			         reverserecursive(node.next);
//			         tail.next=node;
//			         tail=node;
//			         tail.next=null;
//			     }
//		 
//		 public void reverseIterative(){ //without using tail
//		        Node prev=null;
//		        Node pres=head;
//		        Node after=pres.next;
//		        while(after!=null){
//		            pres.next=prev;
//		            prev=pres;
//		            pres=after;
//		            after=after.next;
//		        }
//		        pres.next=prev;
//		        head=pres;
//		    }
//		 
//		Reversing Linked List in a range:https://leetcode.com/problems/reverse-linked-list-ii/description/
//		 public ListNode reverseBetween(ListNode head, int left, int right) {
//		        if (left == right) {
//		             return head;
//		         }
//		         ListNode current = head;
//		         ListNode prev = null;
//		         for (int i = 0; current != null && i < left - 1; i++) {
//		             prev = current;
//		             current = current.next;
//		         }
//		         ListNode last = prev;
//		         ListNode newEnd = current;
//		         ListNode next = current.next;
//		         for (int i = 0; current != null && i < right - left + 1; i++) {
//		             current.next = prev;
//		             prev = current;
//		             current = next;
//		             if (next != null) {
//		                 next = next.next;
//		             }
//		         }
//		         if (last != null) {
//		             last.next = prev;
//		         } else {
//		             head = prev;
//		         }
//		        newEnd.next = current;
//		         return head;
//		     }
//		
//		Given Linked List is Palindrome or not:https://leetcode.com/problems/palindrome-linked-list/submissions/
//			class Solution {
//			    public boolean isPalindrome(ListNode head) {
//			        ListNode mid=middle(head);
//			        ListNode headsec=reverse(mid);
//			        while(head!=null && headsec!=null){
//			            if(head.val!=headsec.val){
//			                return false;
//			            }
//			            head=head.next;
//			            headsec=headsec.next;
//			        }
//			        return true;
//			    }
//			    public ListNode reverse(ListNode head){
//			        if(head==null){
//			            return head;
//			        }
//			        ListNode prev=null;
//			        ListNode pres=head;
//			        ListNode next=head.next;
//			        while(next!=null){
//			            pres.next=prev;
//			            prev=pres;
//			            pres=next;
//			            next=next.next;
//			        }
//			        pres.next=prev;
//			        return pres;
//			    }
//			    public ListNode middle(ListNode head){
//			        ListNode s=head;
//			        ListNode f=head;
//			        while(f!=null && f.next!=null){
//			            s=s.next;
//			            f=f.next.next;
//			        }
//			        return s;
//			    }
//			}
//		
//		
//}
