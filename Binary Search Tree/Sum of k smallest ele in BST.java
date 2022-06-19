class Tree {
    static ArrayList<Integer> arr = new ArrayList<>();
    int sum(Node root, int k) { 
        
        int sum=0;
        arr.clear();
        storeNode(root);
        for(int i=0;i<k;i++) {
            sum +=arr.get(i);
        }
        return sum;
    }
    void storeNode(Node root) {
        if(root==null) {
            return;
        }
        storeNode(root.left);
        arr.add(root.data);
        storeNode(root.right);
    }
}
