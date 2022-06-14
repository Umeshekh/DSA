class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        
      // Queue is an interface. 
        Queue<Integer> result = new LinkedList<Integer>();
        Stack<Integer> st= new Stack<>();
        
        while(!q.isEmpty()) {
            st.add(q.peek());
            q.remove();
        }
        while(!st.isEmpty()) {
            result.add(st.peek());
            st.pop();
        }
        
        return result;
    } 
}


// Approach: 
// while loop 1: removing all the elements of queue and inserting them to stack
// while loop 2: popping all the elements of stack and adding to queue 
