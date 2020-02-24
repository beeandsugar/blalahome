package Unit6_5_super.demo;

import Unit6_5_super.Unit6_5_super;

public class Father {
//    public Father(){
//        System.out.println("father的无参构造函数");
//    }

    static{
        System.out.println("Father--父类--静态代码块--显示顺序-Dad-1");
    }

    /**
     * 若不显式地表示父类的 无参构造函数 -- 仅有有参构造函数的时候
     * 子类用super()调用父类的构造函数 是不行的 --> 因为父类如果有 有参构造 则不会默认存在 无参构造 -- super()引用为空
     * 编译器会报错
     *
     * 因此
     * 如 父类 Father(int age, String name)
     * 则 子类 super(int age, String name)
     *
     *
     * @param age
     * @param name
     */
    public Father(int age, String name){
        System.out.println("父类-有参构造函数");
        System.out.println("父类-构造函数-执行顺序--DAD2--在static代码块之后");
    }
    /**
     * 父类方法：sleep()
     */
    public void sleep(){
        System.out.println("父类--睡觉方法");
    }

}
