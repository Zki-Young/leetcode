package leetcode.easy;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 存在重复元素
 * @Auther: Zki Young
 * @Date: 2023/9/27 15:39
 * @company：CTTIC
 */
public class Test217 {
    @Test
    public void testMain() {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
