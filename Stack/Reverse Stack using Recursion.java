class Solution
{ 
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        recursive(list,s);
        return list;
        
        
    }
    static void recursive(ArrayList<Integer> list,Stack<Integer> s) {
        if(s.empty()) {
            return;
        }
        list.add(s.pop());
        recursive(list,s);
   
        
    }
}
