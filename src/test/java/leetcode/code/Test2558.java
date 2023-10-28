package leetcode.code;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @Description: 2558. 从数量最多的堆取走礼物
 * @Auther: Zki Young
 * @Date: 2023/10/28 19:25
 */
public class Test2558 {
    @Test
    public void main(){
        System.out.println(pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            pq.offer(gift);
        }
        while (k > 0) {
            k--;
            int x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }
        long res = 0;
        while (!pq.isEmpty()) {
            res += pq.poll();
        }
        return res;
    }
}
