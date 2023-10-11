package leetcode.domain;

/**
 * @Description: 节点
 * @Auther: Zki Young
 * @Date: 2023/10/11 08:27
 * @company：CTTIC
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
