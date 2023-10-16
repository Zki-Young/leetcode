package test.thread.communication;

/**
 * @Description: 3个厨子，2个吃货，包子
 * @Auther: Zki Young
 * @Date: 2023/10/15 12:44
 */
public class TestCommunication {
    public static void main(String[] args) {
        Desk desk = new Desk();
        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                while (true) {
                    desk.make();
                }
            }, "厨师" + i).start();
        }
        for (int i = 1; i <= 2; i++) {
            new Thread(() -> {
                while (true) {
                    desk.eat();
                }
            }, "吃货" + i).start();
        }
    }
}
