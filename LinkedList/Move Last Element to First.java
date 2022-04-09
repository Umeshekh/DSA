  Node moveToFirst(Node head) {
         // Base case
        if(head==null || head.next==null) {
            return head;
        }
        // Another case that may not get fit in our logic.
        if(head.next.next==null) {
            Node temp=head.next;
            temp.next = head;
            head=temp;
            return head;
        }
   
        Node temp=head;
        while (temp.next.next != null) {
            temp=temp.next;
        }
        Node last=temp.next;
        temp.next=null;
        last.next=head;
        head=last;
        return head;
    }
