class Tree
{
    
    void leftViewUtil(Node root,ArrayList<Integer> l,int level) {
        // base case 
        if(root == null) {
            return;
        }
        if(l.size()== level) {
            l.add(root.data);
        }
        leftViewUtil(root.left,l,level+1);
        leftViewUtil(root.right,l,level+1);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> l = new ArrayList<>();
      leftViewUtil(root,l,0);
      return l;
    }
}
