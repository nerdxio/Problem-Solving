package stack;

import java.util.Stack;

public class ImplementQueueUsingStacksTracks {
    Stack<Integer> s1;
    Stack<Integer> s2;
    private int front;

    public ImplementQueueUsingStacksTracks() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.empty())
            front = x;
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s2.push(x);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }

    public int pop() {
        int res = s1.pop();
        if (!s1.empty())
            front = s1.peek();
        return res;
    }

    public int peek() {
        return front;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
