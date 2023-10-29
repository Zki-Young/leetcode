package leetcode.code;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 13. 罗马数字转整数
 * @Auther: Zki Young
 * @Date: 2023/10/29 20:49
 */
public class Test13 {
    @Test
    public void main() {
        System.out.println(romanToInt("IV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int ans = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int value = map.get(s.charAt(i));
            if (i < length - 1 && value < map.get(s.charAt(i + 1))){
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
