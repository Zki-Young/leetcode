package leetcode.easy;

import org.junit.Test;

/**
 * @Description: 26. 删除有序数组中的重复项
 * @Auther: Zki Young
 * @Date: 2023/10/17 08:49
 */
public class Test26 {
    @Test
    public void main() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        for (int num : nums) {
            System.out.print(num);
        }
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int left = 1;
        int right = 1;
        while (right < nums.length){
            if (nums[right] != nums[right - 1]){
                nums[left++] = nums[right];
            }
            right++;
        }
        return left;
    }
}
