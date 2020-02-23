package Unit6_7_interface.demo;

//C_classImpl这个类,可以implements多接口。不可以extends多个类。
//定义一个类，如果要实现接口-->必须实现接口的所有方法
public class C implements A,B,Pay {

    @Override
    public void test() {
        //C类要实现A,B,Pay接口--必须实现三接口里所有方法
        //test()---A接口的方法
    }

    @Override
    public void getOrderAmount(){
        //Pay接口的方法
    }
}
