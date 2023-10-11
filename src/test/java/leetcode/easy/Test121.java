package leetcode.easy;

import org.junit.Test;

/**
 * @Description: 买卖股票的最佳时机
 * @Auther: Zki Young
 * @Date: 2023/10/1 22:26
 * @company：CTTIC
 */
public class Test121 {
    @Test
    public void testMain() {
        System.out.println(maxProfit(new int[]{7, 2, 4, 1, 9}));
    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        return max;
    }
}
