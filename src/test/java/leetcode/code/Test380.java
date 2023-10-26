package leetcode.code;
import java.util.*;
/**
 * @Description: 380. O(1) 时间插入、删除和获取随机元素
 * @Auther: Zki Young
 * @Date: 2023/10/26 22:48
 */
public class Test380 {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public Test380() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        map.put(last, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
