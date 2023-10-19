package leetcode.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 80. 删除有序数组中的重复项 II
 * @Auther: Zki Young
 * @Date: 2023/10/18 09:07
 */
public class Test80 {
    @Test
    public void main() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 2){
            return length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < length){
            if (nums[fast] != nums[slow - 2]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
