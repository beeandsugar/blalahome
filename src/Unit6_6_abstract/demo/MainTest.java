package Unit6_6_abstract.demo;

public class MainTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.run();

        //或直接new
        new AutoMobile().run();

        //不能new abstract类
        // new Vehicle()是不对的
    }
}
