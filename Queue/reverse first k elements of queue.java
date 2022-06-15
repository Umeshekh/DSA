class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<k;i++) {
           s.push(q.peek());
           q.remove();
       }
       
       while(!s.isEmpty()) {
           q.add(s.peek());
           s.pop();
       }
       
       for(int i=0;i<q.size()-k;i++) {
           
           q.add(q.peek());
           q.remove();

      }
       
       
       return q;
    
    }
}
