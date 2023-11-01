package leetcode.code;

import org.junit.Test;

import java.util.Arrays;
import java.util.*;

/**
 * @Description: 151. 反转字符串中的单词
 * @Auther: Zki Young
 * @Date: 2023/11/1 09:20
 */
public class Test151 {
    @Test
    public void main(){
        System.out.println(reverseWords("the sky is blue"));
    }
    public String reverseWords(String s) {
        // 匹配任意空白字符：\\s
        String[] split = s.trim().split("\\s+");
        List<String> strings = Arrays.asList(split);
        Collections.reverse(strings);
        String join = String.join(" ", strings);
        return join;
    }
}
