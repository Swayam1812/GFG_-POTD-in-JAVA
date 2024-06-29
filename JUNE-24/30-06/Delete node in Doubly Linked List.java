class Solution {
    public Node deleteNode(Node head, int x) {
        if(x==1)
        {
            Node temp=head;
            temp=temp.next;
            head=temp;
            return head;
        }
        else
        {
            Node temp=head;
            for(int i=1;i<x;i++)
                temp=temp.next;
            if(temp.next==null)
            {
                temp=temp.prev;
                temp.next=null;
            }
            else
                temp.prev.next=temp.next;
        }
        return head;
    }
}

