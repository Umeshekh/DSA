class GfG
{
    boolean isCircular(Node head)
    {

	boolean circular= false;
	Node currNode=head;
	while(currNode.next != null && currNode.next.next!=null) {
	    if(currNode.next.next==head) {
	        circular=true;
	        break;
	    }
	    currNode=currNode.next;
	}
	
	return circular;
    }
}

/* 
- currNode variable which will be equal to head at initially 
- we will traverse entire linked list by incremeting the value of currNode
- if currNode.next.next == head -> linkedlist is circular 
*/
