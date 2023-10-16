package test.thread.communication;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 桌子类，一次只能放一个包子
 * @Auther: Zki Young
 * @Date: 2023/10/15 12:42
 */
public class Desk {
    List<String> list = new ArrayList<>();

    public synchronized void make() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0) {
                System.out.println("桌子空了，" + name + "制作包子");
                list.add(name + "制作的包子");
            } else {
                System.out.println("桌子上有包子，" + name + "看了一眼桌子走了");
            }
            Thread.sleep(1000);
            this.notify();
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void eat() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() > 0) {
                System.out.println("有包子，" + name + "吃" + list.remove(0));
            } else {
                System.out.println("没包子，" + name + "站起来又蹲下了");
            }
            Thread.sleep(1000);
            this.notify();
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
