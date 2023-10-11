package test;

import cn.hutool.core.lang.copier.Copier;
import org.junit.Test;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/10 15:15
 * @company：CTTIC
 */
public class TestMain {
    @Test
    public void testMain(){
        Son son = new Son();

        son.publicMethod();
        son.protectedMethod();

        son.publicMethodNot();
        son.protectedMethodNot();
    }
}
