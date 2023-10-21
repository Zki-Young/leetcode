package leetcode.code;

import org.junit.Test;

/**
 * @Description: 55. 跳跃游戏
 * @Auther: Zki Young
 * @Date: 2023/10/21 12:24
 */
public class Test55 {
    @Test
    public void testMain(){
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean canJump(int[] nums) {
        int rightMost = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= rightMost){
                rightMost = Math.max(rightMost, i + nums[i]);
                if(rightMost >= nums.length - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
