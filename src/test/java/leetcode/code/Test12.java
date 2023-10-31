package leetcode.code;

import org.junit.Test;

/**
 * @Description: 12. 整数转罗马数字
 * @Auther: Zki Young
 * @Date: 2023/10/31 09:36
 */
public class Test12 {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    @Test
    public void main() {
        System.out.println(intToRoman(3999));
    }

    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }
}
