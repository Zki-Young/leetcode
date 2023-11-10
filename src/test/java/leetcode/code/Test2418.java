package leetcode.code;

/**
 * @Description: 2481. 分割圆的最少切割次数
 * @Auther: Zki Young
 * @Date: 2023/11/10 11:22
 */
public class Test2418 {
    public int numberOfCuts(int n) {
        if(n % 2 == 0){
            return n / 2;
        }
        return n == 1 ? 0 : n;
    }
}
