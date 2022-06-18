// Reverse Inorder traversal of BST

class Solution
{
    private static int cur;


    
    public Integer kthLargestutil(Node root,int k) {
        
        if(root == null) {
            return null;
        }
        
        Integer p=kthLargestutil(root.right,k);
        if(p != null) {
            return p;
        }
        if(cur==k) {
            return root.data;
        }
        cur++;
        return kthLargestutil(root.left,k);
        
    }
    
    public int kthLargest(Node root,int K)
    {
       cur=1;
       return kthLargestutil(root,K);
        
    }
}
