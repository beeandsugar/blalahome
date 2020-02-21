package unit5.basicGrammer;

public class Student {

    static int age;   //用static修饰

    String name;    // 不用static修饰

    /**
     * 因为age是变量,只能通过 类.age 拿到 --- 声明一个方法返回age，调用这个方法。
     */
    public int getAge(){
        return age;
    }

    /**
     * 静态方法 不可以访问 非静态变量 ---因为内存中static先有，对象后有。
     * 静态方法 不能用 this
     */

    public static int getHeight(){
        return 5;
    }

    /**
     * * 【静态代码块】
     *  * 加载类的时候，静态代码块 会且仅会被 执行一次
     *  * 静态代码比构造方法先执行 ---静态内容优先于非静态内容！
     *  * ---使用场景---
     *  * 一次性对静态成员变量赋值；
     *  * 类资源初始化；
     *
     */

    static String sex;

    static {
        sex = "boy";
        System.out.println("静态代码块被执行了（且仅执行1次）");
    }
}
