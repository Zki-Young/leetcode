package test;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/15 10:39
 * @company：CTTIC
 */
public class Noti {
    public static void main(String[] args) {

        new Thread(()->{
            for (int i = 0; i < 2; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Thread.interrupted();
        },"myThread").start();

        synchronized ("this"){
            try {
                System.out.println("同步代码块开始等待");
                "this".wait();
                System.out.println("同步代码块");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("已经结束咧");
            }
        }
    }

}
