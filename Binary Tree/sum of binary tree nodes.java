class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null) {
            return 0;
        }
        
       int sum=head.data;
       sum += sumBT(head.left);
       sum += sumBT(head.right);
       return sum;
        
    }
}
