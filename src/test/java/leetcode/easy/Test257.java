package leetcode.easy;

import leetcode.domain.TreeNode;
import java.util.*;
/**
 * @Description: 257. 二叉树的所有路径
 * @Auther: Zki Young
 * @Date: 2023/10/14 09:50
 * @company：CTTIC
 */
public class Test257 {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null){
            list.add(Integer.toString(root.val));
            return list;
        }
        if (root != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(root.val);
            getString(root.left, stringBuilder);
            getString(root.right, stringBuilder);
        }
        return list;
    }

    public void getString(TreeNode treeNode, StringBuilder stringBuilder){
        if (treeNode == null)return;

        String preString = stringBuilder.toString();
        StringBuilder sb = new StringBuilder(preString);
        sb.append("->").append(treeNode.val);
        if (treeNode.left == null && treeNode.right == null){
            list.add(sb.toString());
        } else {
            getString(treeNode.left, sb);
            getString(treeNode.right, sb);
        }
    }
}
