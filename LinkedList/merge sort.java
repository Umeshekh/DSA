class Solution
{
    //Function to sort the given linked list using Merge Sort.
    
    public static Node sortedMerge(Node a,Node b) {
        Node result=null;
        if(a==null) {
            return b;
        }
        if(b==null) {
            return a;
        }
        
        if(a.data < b.data) {
            result=a;
            result.next=sortedMerge(a.next,b);
        }
        
        else{
            result=b;
            result.next=sortedMerge(a,b.next);
        }
        
        return result;
    }
    
    public static Node getMiddle(Node head) {
        Node slow=head;
        Node fast=slow;
        while(fast != null && fast.next == null ) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null ) {
            return head;
        }
        
        Node middel = getMiddle(head);
        Node nextofmiddle = middel.next;
        
        middel.next = null;
        Node left= mergeSort(head);
        Node right = mergeSort(nextofmiddle);
        
        Node sortedlist=sortedMerge(left,right);
        return sortedlist;
    }

}
