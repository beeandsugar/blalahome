package Unit6_7_interface.demo;

public class AliPay implements Pay {

    //实现Pay里所有方法 getOrderAmount()和test()
    @Override
    public void getOrderAmount() {

    }

    @Override
    public void test() {

    }

    //重写父类接口的default方法
    //这里重写的时候不用default关键字修饰---那是修饰接口方法的
    @Override
    public void defaultMethod(){
        System.out.println("重写了父类接口的default方法");
    }

}
