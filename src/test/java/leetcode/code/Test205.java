package leetcode.code;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 同构字符串
 * @Auther: Zki Young
 * @Date: 2023/9/27 14:08
 * @company：CTTIC
 */
public class Test205 {
    @Test
    public void testMain(){
        isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck");
    }

    public void isIsomorphic(String s, String t) {
        System.out.println(getCode(s));
        System.out.println(getCode(t));
    }

    public String getCode(String string){
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int index = 10;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int tmp = map.getOrDefault(c, -1);
            if (tmp == -1){
                tmp = index++;
                map.put(c, tmp);
            }
            sb.append(tmp).append(" ");
        }
        return sb.toString();
    }
}
