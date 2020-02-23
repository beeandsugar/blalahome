package Unit6_5_super.demo;

public class Child extends Father {

    //定义子类的两个属性--age, name
    //这样在方法体内 构建对象时 就有this的指向属性
    //this有了指向属性 调用有参构造函数传入形参的时候 才能使 this.属性(name)的值 = 传入的参数 name = "Bob"这个值
    private int age;
    private String name;

    static{
        System.out.println("Child--子类--静态代码块--执行顺序CHILD-1");
    }

    public Child(){
        //当父类构造函数 == 有参构造函数
        //则子类的构造函数中必须用super(参数类型,参数1,...)调用父类的构造函数
        super(2,"amyForNone");
        System.out.println("子类--无参构造函数");
        super.sleep();      //子类的构造函数里可以用super调用父类的方法
        System.out.println("子类-构造函数-执行顺序--在子类static代码块之后");
    }

    public Child(int age, String name){
        //当父类构造函数 == 有参构造函数
        //则子类的构造函数中必须用super(参数类型,参数1,...)调用父类的构造函数
        super(40,"Bob");
        this.age = age;
        this.name = name;
        super.sleep();      //子类的构造函数里可以用super调用父类的方法
        System.out.println("子类--有参构造函数");
    }

    public void sleep(){
        System.out.println("子类--重写的父类的sleep()");
    }

    //即 在某方法里需要 创建Child类的对象的时候--用到有参构造函数
    //则需要传入age, name这两个参
    public void test2(int age, String name){
        //调用的是 有参构造函数
        Child n = new Child(10,"testName");

    }


    public void test1(){
        super.sleep();
        //子类调用父类的sleep()方法---即有时不用子类里面重写的sleep()方法
    }

    public void testSuper(){
        //调用的是 无参构造函数
    }



}
