/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slowP = head;
        ListNode fastP = head;
        while(fastP!=null && fastP.next!=null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if(slowP==fastP){
                
                slowP=head;
                
                while(slowP!=fastP)
                {
                    slowP=slowP.next;
                    fastP=fastP.next;
                }
                
                return fastP;
                
            }
        }
        return null;
        
    }
}