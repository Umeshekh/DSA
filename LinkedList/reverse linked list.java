package LinkedList;

import java.util.Scanner;




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
            System.out.println("Enter total no of elements:");
            int n=sc.nextInt();
            int a=sc.nextInt();
            Node head=new Node(a);
            Node tail=head;
            for( int i=1;i<n;i++) {

                tail.next=new Node(sc.nextInt());
                tail=tail.next;
            }

            Solution1 ob=new Solution1();
            System.out.println("Before reversing..");
            printList(head);
            head= ob.reverse(head);
            System.out.println("After reversing...");
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
         // we need three pointers
         // next,prev and curr
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


/*
Enter the number of test cases
1
Enter total no of elements:
5
1
2
3
4
5
Before reversing..
1 2 3 4 5
After reversing...
5 4 3 2 1

 */
