package Unit6_7_interface.demo;

//接口是可以多继承的 extends A,B
// 普通类不可以多继承
public interface Pay extends A,B{

    int money = 10;  //权限修饰符--默认public static final

    void getOrderAmount();   //没有加权限修饰符--默认 public abstract 不能用其它的

    //static方法
    static void staticMethod(){
        System.out.println("接口的static方法");
    }

    //default方法--定义默认的（实现）方法，默认（实现）方法不是抽象方法，可以重写，可以不重写。
    default void defaultMethod(){
        System.out.println("接口的default方法");
    }

}
