package leetcode.easy;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 242. 有效的字母异位词
 * @Auther: Zki Young
 * @Date: 2023/10/13 10:12
 * @company：CTTIC
 */
public class Test242 {
    @Test
    public void testMain() {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
