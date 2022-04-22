class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {  // Base case
            return null;
        }
        if (root.val > key) { // for traversing upto that key value node
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) { // for traversing upto key value node
            root.right = deleteNode(root.right, key);
        } else {  // this block will be executed once we reach to that node which we have to delete.
            if (root.left == null && root.right == null) { // if no child for key value node
                return null;
            } else if (root.left == null || root.right == null) {
                return root.left == null ? root.right : root.left;
            }
            TreeNode rightMinNode = getRightMinNode(root.right);
            rightMinNode.left = root.left;
            return root.right;
           
        }
        
        
        return root;
        
    }
    public TreeNode getRightMinNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
