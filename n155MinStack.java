/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 */
import java.util.Stack;
public class n155MinStack {
    public static void main(String[] args){
        MinStack s = new MinStack();
        s.push(2);
        s.push(0);
        s.push(3);
        s.push(0);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }

}
class MinStack {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if( minStack.isEmpty() || x<=minStack.peek() ) {
            minStack.push(x);
        }

    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())) {     //pop的时候，如果把最小值pop出去了，minStack里的最小值也要变化
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
