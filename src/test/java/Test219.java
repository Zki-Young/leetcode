import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 存在重复元素 II
 * @Auther: Zki Young
 * @Date: 2023/9/28 10:10
 * @company：CTTIC
 */
public class Test219 {
    @Test
    public void testMain() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int winSize = k + 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() == winSize) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
