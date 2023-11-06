package leetcode.code;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 383. 赎金信
 * @Auther: Zki Young
 * @Date: 2023/11/6 23:04
 */
public class Test383 {
    @Test
    public void main() {
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char key = magazine.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            Integer integer = map.get(key);
            if (integer == null || integer == 0) {
                return false;
            } else {
                map.put(key, integer - 1);
            }
        }
        return true;
    }
}
