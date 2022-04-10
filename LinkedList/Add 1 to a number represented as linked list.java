class Solution
{
    
    public static Node reverse(Node head) {
        Node prev=null;
        Node next=null;
        Node curr = head;
        while(curr != null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        // base case 
       head = reverse(head);
       boolean f= true;
       Node curr = head;
       while(curr != null && f==true) {
           if(curr.next == null && curr.data == 9) {
               curr.data=1;
               Node temp = new Node(0);
               temp.next = head;
               head=temp;
               curr = curr.next;
           }
           
           else if(curr.data==9) {
               curr.data = 0;
               curr=curr.next;
           }
           else {
               curr.data = curr.data +1;
               curr = curr.next;
               f=false;
           }
       }
       
       head = reverse(head);
       return head;
        
    }
}

/* 
For Input: 
456

Your Output: 
457
*/

