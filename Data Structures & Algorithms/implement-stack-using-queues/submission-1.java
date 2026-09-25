class MyStack {
    Queue<Integer> q;
    Queue<Integer> q1;
    public MyStack() {
        q = new LinkedList<>();
        q1 = new LinkedList<>(); 
    }   
    public void push(int x) {
        q.add(x);
    }
    public int pop() {
        while (q.size() > 1) {
            q1.add(q.remove());
        }
        int topElement = q.remove();
        Queue<Integer> temp = q;
        q = q1;
        q1 = temp;
        
        return topElement;
    }
    public int top() {
        while (q.size() > 1) {
            q1.add(q.remove());
        }
        int topElement = q.peek();
        q1.add(q.remove());
        Queue<Integer> temp = q;
        q = q1;
        q1 = temp;
        return topElement;
    }
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */