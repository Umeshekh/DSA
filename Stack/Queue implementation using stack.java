public class QueueUsingStack {
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();
    // making enqueue operation costly
    public static void enqueue(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }


    public static void dequeue() {
        if(stack1.isEmpty()) {
            System.out.println("queue is empty");
        }
        else {
            int x=(Integer)stack1.pop();
            System.out.println("Element after deque "+x);
        }
    }


    public static void main(String[] args) {
           for(int i=1;i<=5;i++) {
               enqueue(i);
           }
           dequeue();
    }
}
