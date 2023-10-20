package leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/3 20:09
 * @company：CTTIC
 */
public class Test225 {
}
class MyStack {
    List<Integer> list;
    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int ans = 0;
        int index = list.size() - 1;
        if (index >= 0){
            ans = list.get(index);
            list.remove(index);
        }
        return ans;
    }

    public int top() {

        int ans = 0;
        int index = list.size() - 1;
        if (index >= 0){
            ans = list.get(index);
        }
        return ans;
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
