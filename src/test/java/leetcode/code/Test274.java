package leetcode.code;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 274. H 指数
 * @Auther: Zki Young
 * @Date: 2023/10/25 17:43
 */
public class Test274 {
    @Test
    public void main(){
        System.out.println(hIndex(new int[]{1,7,9,4}));
    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans = citations.length;
        for (int citation : citations) {
            if (citation < ans){
                ans--;
            } else {
                return ans;
            }
        }
        return ans;
    }
}
