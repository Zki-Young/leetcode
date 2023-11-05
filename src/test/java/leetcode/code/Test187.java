package leetcode.code;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 187. 重复的DNA序列
 * @Auther: Zki Young
 * @Date: 2023/11/5 12:06
 */
public class Test187 {

    static final int L = 10;

    @Test
    public void main() {
        for (String s : findRepeatedDnaSequences02("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")) {
            System.out.println(s);
        }
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
            if (map.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }

    public List<String> findRepeatedDnaSequences02(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.get(str) == 2) {
                ans.add(str);
            }
        }
        return ans;
    }
}
