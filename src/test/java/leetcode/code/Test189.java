package leetcode.code;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 189. 轮转数组
 * @Auther: Zki Young
 * @Date: 2023/10/20 09:15
 */
public class Test189 {

    @Test
    public void main() {

        int[] nums = {7, 1, 2, 3, 4, 5, 6};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(ints, 0, nums, 0, nums.length);
    }
}
