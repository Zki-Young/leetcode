package test;

/**
 * @Description: TODO
 * @Auther: Zki Young
 * @Date: 2023/10/10 15:08
 * @company：CTTIC
 */
public class Father {
    public void publicMethod() {
        System.out.println("父类public方法");
    }

    public void publicMethodNot() {
        System.out.println("子类不去重写的父类public方法");
    }

    protected void protectedMethod() {
        System.out.println("父类protected方法");
    }

    protected void protectedMethodNot() {
        System.out.println("子类不去重写的父类protected方法");
    }

    private void privateMethod() {
        System.out.println("父类private方法");
    }

    private void privateMethodNot() {
        System.out.println("子类不去重写的父类private方法");
    }
}

class Moon{

}
