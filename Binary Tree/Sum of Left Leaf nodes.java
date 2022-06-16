class Solution{

    public int leftLeavesSum(Node root) 
    { 
        
        
        if(root==null) {
            return 0;
        }
        // case 1
        if(root.left !=null) {
            if(root.left.left==null && root.left.right==null) {
                return root.left.data + leftLeavesSum(root.right);
            }
        }
            return leftLeavesSum(root.left) + leftLeavesSum(root.right);
        
        
    } 

}
