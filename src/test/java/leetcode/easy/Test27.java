package leetcode.easy;

import org.junit.Test;

/**
 * @Description: 27. 移除元素
 * @Auther: Zki Young
 * @Date: 2023/10/16 08:01
 */
public class Test27 {

    @Test
    public void main() {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
        for (int num : nums) {
            System.out.print(num);
        }
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j--];
            } else {
                i++;
            }
        }
        return j + 1;
    }
}
