package test;

import cn.hutool.core.lang.copier.Copier;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/10 15:15
 * @company：CTTIC
 */
public class TestMain {

    @Test
    public void testMain(){
        System.out.println("hello");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("world");
    }

    public int test(int a){
        try {
            if (a == 0){
                System.out.println("123");
                return 0;
            } else {
                System.out.println("456");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return 0;
    }





    public void testArray(int [] ints){
        ints[0] = 100;
    }
    @Test
    public void test(){
        SimpleDateFormat simpleDateFormat;
        DateTimeFormatter dateTimeFormatter;
        ConcurrentHashMap<Integer, Integer> concurrentHashMap;
        Hashtable<Integer, IInterface> hashtable;

//        int implements = 1;

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
