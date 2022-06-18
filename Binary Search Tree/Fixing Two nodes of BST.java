class Solution
{
    
    Node first,middle,prev,last;
    
    public void correctBSTUtil(Node root) {
        
        if(root != null) {
            correctBSTUtil(root.left);
            
            if(prev!=null && root.data < prev.data) {
                 
                 if(first==null) {
                     first=prev;
                     middle=root;
                 }
                 else {
                     last=root;
                 }            
            }
            
            prev=root;
            correctBSTUtil(root.right);
        }   
    }
    
    
    public Node correctBST(Node root)
    {
        first=middle=prev=last=null;
        correctBSTUtil(root);
        
        if(first!=null && last!=null) {
          int temp=first.data;
          first.data=last.data;
          last.data=temp;
        }
        else if(first!=null && middle!=null) {
            int temp=first.data;
            first.data = middle.data;
            middle.data=temp;
            
        }
        return root;
    }
