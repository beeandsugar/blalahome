package Unit6_5_super.demo;

public class MainTest {
    public static void main(String[] args) {
        new Child().sleep();
        //调用testSuper()--调用Child构造函数--里面含有super()+自己语句-->父类和子类构造函数的内容都执行

    }
}
