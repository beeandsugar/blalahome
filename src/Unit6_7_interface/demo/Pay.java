package Unit6_7_interface.demo;

public interface Pay {

    int money = 10;  //权限修饰符--默认public static final

    boolean getOrderAmount();   //没有加权限修饰符--默认 public abstract 不能用其它的


}
