package leetcode.code;

import org.junit.Test;

/**
 * @Description: 45. 跳跃游戏 II
 * @Auther: Zki Young
 * @Date: 2023/10/24 21:39
 */
public class Test45 {
    @Test
    public void testMain(){
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
    public int jump(int[] nums) {
        int steps = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == end){
                end = max;
                steps++;
            }
        }
        return steps;
    }
}
