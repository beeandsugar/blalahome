package Unit6_6_abstract.demo;

//定义抽象类--父类Vehicle
public abstract class Vehicle {

    public abstract void run();  //加abstract关键字 --方法声明为abstract-->类必须声明为abstract

    public void stop(){
        System.out.println("停在路上");
    }
}


