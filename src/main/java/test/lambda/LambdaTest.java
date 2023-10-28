package test.lambda;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/27 17:32
 */
public class LambdaTest {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " hello");
        }, "thread01").start();
        System.out.println(Thread.currentThread().getName() + " hello");
        new Runnable(){
            @Override
            public void run() {
                System.out.println();
            }
        };
    }
}
