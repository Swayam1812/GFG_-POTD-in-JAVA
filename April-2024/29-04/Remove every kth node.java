class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
// Your code here 
if(k==1) return null;
int count = 1;
Node temp = head;
while(temp.next != null && temp.next.next !=null){
    if(count == (k-1)){
        temp.next = temp.next.next;
        count=1;
    }else 
        count++;
    temp = temp.next;
}
if(count == (k-1)) temp.next = null;
return head;
    }
}
