package leetcode.code;

import org.junit.Test;

/**
 * @Description: 231. 2 的幂
 * @Auther: Zki Young
 * @Date: 2023/10/7 06:41
 * @company：CTTIC
 */
public class Test231 {
    @Test
    public void testMain(){
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(32));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        while(n % 2 == 0){
            n /= 2;
            if (n == 1){
                return true;
            }
        }
        return false;
    }
}
