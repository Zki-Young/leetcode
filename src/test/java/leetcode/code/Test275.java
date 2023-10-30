package leetcode.code;

import org.junit.Test;

/**
 * @Description: 275. H 指数 II
 * @Auther: Zki Young
 * @Date: 2023/10/30 08:18
 */
public class Test275 {

    @Test
    public void main() {
        System.out.println(hIndex(new int[]{0, 1, 3, 5, 6}));
    }

    public int hIndex(int[] citations) {
        int ans = citations.length;
        for (int citation : citations) {
            if (ans > citation) {
                ans--;
            } else {
                return ans;
            }
        }
        return ans;
    }
}
