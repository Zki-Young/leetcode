package leetcode.easy;

import leetcode.domain.ListNode;
import org.junit.Test;

import java.util.*;

/**
 * @Description: 234. 回文链表
 * @Auther: Zki Young
 * @Date: 2023/10/11 08:25
 * @company：CTTIC
 */
public class Test234 {
    @Test
    public void testMain() {

    }


    public boolean isPalindrome(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.val);
            head = head.next;
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    //双指针
    public boolean isPalindrome02(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
