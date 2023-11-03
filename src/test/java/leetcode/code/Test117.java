package leetcode.code;

import leetcode.domain.Node;
import java.util.*;
/**
 * @Description: 117. 填充每个节点的下一个右侧节点指针 II
 * @Auther: Zki Young
 * @Date: 2023/11/3 22:29
 */
public class Test117 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            Node last = null;
            for (int i = 1; i <= n; ++i) {
                Node f = queue.poll();
                if (f.left != null) {
                    queue.offer(f.left);
                }
                if (f.right != null) {
                    queue.offer(f.right);
                }
                if (i != 1) {
                    last.next = f;
                }
                last = f;
            }
        }
        return root;
    }
}
