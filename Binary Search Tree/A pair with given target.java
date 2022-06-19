class Solution
{
   
    public int isPairPresent(Node root, int target)
    {

        for(int i=1;i<=target/2;i++) {
            if(isPresent(root,i) && isPresent(root,target-i)) {
                return 1;
            }
        }
        return 0;
        
    }
    
    public boolean isPresent(Node root,int tar) {
        if(root==null) {
            return false;
        }
        if(root.data==tar) {
            return true;
        }
        if(root.data < tar) {
            return isPresent(root.right,tar);
        }
        return isPresent(root.left,tar);
        
        
    }
 
}
