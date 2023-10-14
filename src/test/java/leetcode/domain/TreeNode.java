package leetcode.domain;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/14 09:51
 * @company：CTTIC
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
