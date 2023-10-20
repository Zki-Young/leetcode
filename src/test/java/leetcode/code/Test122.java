package leetcode.code;

import org.junit.Test;

/**
 * @Description: 买卖股票的最佳时机 II
 * @Auther: Zki Young
 * @Date: 2023/10/2 22:33
 * @company：CTTIC
 */
public class Test122 {
    @Test
    public void testMain(){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]){
                ans += prices[i + 1] - prices[i];
            }
        }
        return ans;
    }
}
