
class Node {
    int data;
    Node next;
    Node(int key){
        data=key;
        next=null;
    }
}

public class LinkedList_2 {

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int a=sc.nextInt();
            Node head=new Node(a);
            Node tail=head;
            for( int i=1;i<n;i++) {
                tail.next=new Node(sc.nextInt());
                tail=tail.next;
            }
            Solution1 ob=new Solution1();
            head= ob.reverse(head);
            printList(head);


        }
    }
}
class Solution1{
     Node reverse(Node head){
        //base case
        if(head==null || head.next == null) {
            return head;
        }
        Node next=null;
        Node prev= null;
        Node curr=head;
        while (curr != null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

}
