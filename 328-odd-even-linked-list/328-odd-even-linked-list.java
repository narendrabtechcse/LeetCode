/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public static ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null )
            return head;

        ListNode oddList=null,evenStart=null,oddStart=null,evenList=null;
        int length = Length(head);
        ListNode curr=head,forward=null;

        for(int i = 1;i<=length;i++){
            forward = curr.next;
            curr.next = null;

            if(i%2==0){
                if(evenList==null) {
                    evenList = curr;
                    evenStart = evenList;
                  
                }
                else {
                    evenList.next = curr;
                    evenList = evenList.next;
                }
            }else{
                if(oddList==null) {
                    oddList = curr;
                    oddStart = oddList;
                }
                else {
                    oddList.next = curr;
                    oddList = oddList.next;
                }
            }
            curr = forward;
        }
        oddList.next = evenStart;

        return oddStart;
    }

    static int Length(ListNode head){
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        return length;
    }
}