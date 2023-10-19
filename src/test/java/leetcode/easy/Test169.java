package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 169. 多数元素
 * @Auther: Zki Young
 * @Date: 2023/10/19 23:10
 */
public class Test169 {
    @Test
    public void testMain(){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        System.out.println(Arrays.toString(nums));
    }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
