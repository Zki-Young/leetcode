package leetcode.easy;

import leetcode.domain.ListNode;
import org.junit.Test;

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
}
