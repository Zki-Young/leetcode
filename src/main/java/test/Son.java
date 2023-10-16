package test;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/10 15:11
 * @company：CTTIC
 */
public class Son extends Father{

    public void publicMethod() {
        System.out.println("子类public方法");
    }

    protected void protectedMethod() {
        System.out.println("子类protected方法");
    }

    public void privateMethod() {
        System.out.println("子类private方法");
    }
}
