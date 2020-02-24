package Unit6_7_interface.demo;

public class MaintTest {
    public static void main(String[] args) {
        Pay.staticMethod();    //接口的static方法只属于接口，直接调用 接口.static的方法名() 即可

       new AliPay().defaultMethod(); //和使用对象声明是一样的

        AliPay aliPay = new AliPay();
        aliPay.defaultMethod(); //声明一个对象来调用Alipay类的方法
    }

}
