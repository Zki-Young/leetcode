package leetcode.easy;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 最小和分割
 * @Auther: Zki Young
 * @Date: 2023/10/9 19:33
 * @company：CTTIC
 */
public class Test2578 {

    @Test
    public void testMain() {
        System.out.println(splitNum(4325));
        System.out.println(splitNum(687));
    }

    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.sort(list);
        int i = list.size() / 2 * 2;
        int ans = 0;
        int ans02 = 0;
        for (int j = 0; j < i; j += 2) {
            int remove = list.remove(0);
            ans = ans * 10 + remove;
            remove = list.remove(0);
            ans02 = ans02 * 10 + remove;
        }
        if (list.size() != 0) {
            ans = ans * 10 + list.remove(0);
        }
        return ans + ans02;
    }
}
