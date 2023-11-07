package leetcode.code;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 2586. 统计范围内的元音字符串数
 * @Auther: Zki Young
 * @Date: 2023/11/7 11:05
 */
public class Test2586 {
    @Test
    public void main() {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        System.out.println(vowelStrings(words, 1, 4));
    }

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for (int i = left; i <= right; i++) {
            String str = words[i];
            if (set.contains(str.charAt(0)) && set.contains(str.charAt(str.length() - 1))){
                ans++;
            }
        }
        return ans;
    }
}
