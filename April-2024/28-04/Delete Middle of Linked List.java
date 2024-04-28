class Solution 
{
    Node deleteMid(Node head) 
    {
        if(head == null || head.next == null)
            return null;
            
        Node slow = head, fast= head, prev = null;
        
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        return head;
    }
}
