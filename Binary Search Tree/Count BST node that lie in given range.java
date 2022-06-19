class Solution
{
    static ArrayList<Integer> arr=new ArrayList<>();
    
    int getCount(Node root,int l, int h)
    {
        int count=0;
        arr.clear();
        storeNode(root,l,h);
        for(int i=0;i<arr.size();i++) {
            int ele=arr.get(i);
            
            if(ele>=l && ele <=h) {
                count++;
            }
            
        }
        return count;
        
    }
    void storeNode(Node root,int l,int h) {
        
        if(root==null) {
            return;
        }
        storeNode(root.left,l,h);
        arr.add(root.data);
        storeNode(root.right,l,h);
        
        
    }
}
