import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}
  
  
  class GfG
{
    // merge function will merge two linked list in sorted manner.
     Node merge(Node a, Node b) {
        // if a is null then we will return b
        if(a==null) {
            return b;
        }
       // if b is null then we will return a
        if(b==null){
            return a;
        }
        
        Node result;
       
        if(a.data < b.data) {
            result=a; // result will get head value 
            result.bottom=merge(a.bottom,b); // rest of the values of result linked list will get by recursive call
        }
        else {
            result=b;
            result.bottom=merge(a,b.bottom);
        }
        
        result.next=null;
        return result;
    }
    
    
    Node flatten(Node root)
    {
       if(root==null || root.next==null) {
           return root;
       }
       
      // we have to flatten the linked list from end 
      // for that particular reason, we will go to sedond last node of linked list
       root.next=flatten(root.next);
      // we will use second last and last node's linked list 
       root=merge(root,root.next);
       return root;
    }
}
