package leetcode.code;

import org.junit.Test;

/**
 * @Description: 2609. 最长平衡子字符串
 * @Auther: Zki Young
 * @Date: 2023/11/8 21:44
 */
public class Test2609 {
    @Test
    public void testMain() {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
    }

    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int numZero = 0;
        int numOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                numOne++;
                ans = Math.max(ans , 2 * Math.min(numZero, numOne));
            } else if(i == 0 || s.charAt(i - 1) == '1'){
                numZero = 1;
                numOne = 0;
            } else {
                numZero++;
            }
        }
        return ans;
    }
}
