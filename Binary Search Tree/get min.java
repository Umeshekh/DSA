
class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
       if(node == null) {  // base case when tree is empty
           return -1;
       }
       if(node.left == null) { // when left of node is null 
           return node.data;
       }
       else if(node.left != null) {  // when left of node is not null so we can keep traversing
           return minValue(node.left);
       } 
       
       else { 
           return node.data;
       }
      
    }
}
