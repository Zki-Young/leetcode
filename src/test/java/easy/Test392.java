package easy;

import org.junit.Test;

/**
 * @Description: 392. 判断子序列
 * @Auther: Zki Young
 * @Date: 2023/10/10 10:30
 * @company：CTTIC
 */
public class Test392 {
    @Test
    public void testMain(){
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
//        System.out.println("".length());
        System.out.println(isSubsequence("", "ahbgdc"));
    }
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")){
            return true;
        }
        int i = 0;
        int j = 0;
        while(j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                if (i == s.length()){
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
