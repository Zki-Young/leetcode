package test;

import cn.hutool.core.lang.copier.Copier;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/10 15:15
 * @company：CTTIC
 */
public class TestMain {
    @Test
    public void testMain(){
        int [] ints = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(ints));

        testArray(ints);
        System.out.println(Arrays.toString(ints));
    }
    public void testArray(int [] ints){
        ints[0] = 100;
    }
    @Test
    public void test(){
//        double d01 = 123456789012;
        double d02 = 123456789012d;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        long l = 2147483648l;

        Thread thread = new Thread(()->{
            System.out.println("hello");
        });

        thread.start();
//        thread.init();
        thread.run();
        thread.resume();
        thread.interrupt();
        try {
            thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Boolean a;  boolean b;
        Double  c;   double d;

        Throwable t;
        IOException e;
        RuntimeException ad;
        FileNotFoundException adsfa;
    }
}
