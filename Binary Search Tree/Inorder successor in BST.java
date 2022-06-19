class Solution
{
   
	public Node inorderSuccessor(Node root,Node x)
         {
          Node succ=null;
          while(root !=null) {
              
              if(x.data >= root.data) {
                  root=root.right;
              }
              else {
                  succ=root;
                  root=root.left;
              }
             
          }
          return succ;
         }
}
