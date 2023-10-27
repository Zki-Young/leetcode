package leetcode.code;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 238. 除自身以外数组的乘积
 * @Auther: Zki Young
 * @Date: 2023/10/27 12:14
 */
public class Test238 {
    @Test
    public void testMain() {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(ints));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        int suffix = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }
}
