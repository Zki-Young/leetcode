package leetcode.code;

import org.junit.Test;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/11/2 15:44
 */
public class Test2103 {

    @Test
    public void main() {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }

    public int countPoints(String rings) {
        int[][] ints = new int[100][3];
        for (int i = 0; i < rings.length(); i += 2) {
            char _01 = rings.charAt(i);
            int _02 = rings.charAt(i + 1) - '0';
            System.out.println(_02);
            if (_01 == 'R') {
                if (ints[_02][0] == 0) {
                    ints[_02][0] = 1;
                }
            } else if (_01 == 'G') {
                if (ints[_02][1] == 0) {
                    ints[_02][1] = 1;
                }
            } else if (_01 == 'B') {
                if (ints[_02][2] == 0) {
                    ints[_02][2] = 1;
                }
            }
        }
        int ans = 0;
        for (int[] anInt : ints) {
            if (anInt[0] == 1 && anInt[1] == 1 && anInt[2] == 1) {
                ans++;
            }
        }
        return ans;
    }
}
