package leetcode.easy;

import java.util.Stack;

/**
 * @Description: 232. 用栈实现队列
 * @Auther: Zki Young
 * @Date: 2023/10/8 06:25
 * @company：CTTIC
 */
class MyQueue {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.pop());
    }

    Stack<Integer> stack01;
    Stack<Integer> stack02;

    public MyQueue() {
        stack01 = new Stack<>();
        stack02 = new Stack<>();
    }

    public void push(int x) {
        stack01.push(x);
    }

    public int pop() {
        int ans;
        for (int i = stack01.size(); i > 0; i--) {
            stack02.push(stack01.pop());
        }
        ans = stack02.pop();
        for (int i = stack02.size(); i > 0; i--) {
            stack01.push(stack02.pop());
        }
        return ans;
    }

    public int peek() {
        int ans;
        for (int i = stack01.size(); i > 0; i--) {
            stack02.push(stack01.pop());
        }
        ans = stack02.peek();
        for (int i = stack02.size(); i > 0; i--) {
            stack01.push(stack02.pop());
        }
        return ans;
    }

    public boolean empty() {
        return stack01.size() == 0;
    }
}
