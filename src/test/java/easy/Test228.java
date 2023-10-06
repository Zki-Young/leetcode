package easy;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 汇总区间
 * @Auther: Zki Young
 * @Date: 2023/10/6 13:06
 * @company：CTTIC
 */
public class Test228 {

    @Test
    public void test() {
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int low = i++;
            while(i < nums.length && nums[i - 1] + 1 == nums[i]){
                i++;
            }
            StringBuilder sb = new StringBuilder(Integer.toString(nums[low]));
            if (low != i - 1){
                sb.append("->").append(Integer.toString(nums[i - 1]));
            }
            list.add(sb.toString());
        }
        return list;
    }
}
