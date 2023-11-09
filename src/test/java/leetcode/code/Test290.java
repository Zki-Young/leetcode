package leetcode.code;

import com.sun.media.jfxmediaimpl.platform.gstreamer.GSTPlatform;
import org.junit.Test;

import java.util.*;

/**
 * @Description: 290. 单词规律
 * @Auther: Zki Young
 * @Date: 2023/11/9 08:15
 */
public class Test290 {
    @Test
    public void main() {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] split = s.trim().split("\\s");
        if (pattern.length() != split.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String string = split[i];
            if (!map.containsKey(c)) {
                if (!map2.containsKey(string)){
                    map.put(c, string);
                    map2.put(string, c);
                } else {
                    return false;
                }
            } else if (!map.get(c).equals(split[i])) {
                return false;
            }
        }
        return true;
    }
}
