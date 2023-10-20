package leetcode.code;

import org.junit.Test;

/**
 * @Description: 258. 各位相加
 * @Auther: Zki Young
 * @Date: 2023/10/15 07:52
 * @company：CTTIC
 */
public class Test258 {

    @Test
    public void test(){
        System.out.println(addDigits(38));
    }

    public int addDigits(int num) {
        String s = Integer.toString(num);
        char[] chars = s.toCharArray();
        int ans = 0;
        for (char aChar : chars) {
            ans += aChar - '0';
        }
        if (ans > 9){
            ans = addDigits(ans);
        }
        return ans;
    }

    //leetcode题解
//    public int addDigits(int num) {
//        return (num - 1) % 9 + 1;
//    }
}
