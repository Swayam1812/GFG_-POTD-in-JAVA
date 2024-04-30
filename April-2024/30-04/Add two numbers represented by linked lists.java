class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node temp){
        Node prev=null;
        Node cur=temp;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        num1=reverse(num1);
        num2=reverse(num2);
        Node head=new Node(0);
        Node add=head;
        int total=0,carry=0;
        while(num1!=null || num2!=null || carry!=0){
            total=carry;
            if(num1!=null){
                total+=num1.data;
                num1=num1.next;
            }
            if(num2!=null){
                total+=num2.data;
                num2=num2.next;
            }
            int sum=total%10;
            carry=total/10;
            head.next=new Node(sum);
            head=head.next;
        }
        add=reverse(add.next);

//To remove leading zero
        while(add.data==0 && add.next!=null){
            add=add.next;
        }
        return add;
    }
}
