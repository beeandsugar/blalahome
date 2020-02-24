package Unit6_2_Constructor;

/**
 * 构造函数---构造对象--new 类() 的对象
 * <p>
 * 一个类里可以有多个构造函数
 * java会自动为每一个类提供构造函数（默认构造函数）
 * 没有返回值
 * <p>
 * public User(){ }  --构造函数（默认）
 * 里面可以加东西--初始化内容
 * <p>
 * 1.默认构造函数
 * public 类 () {
 * //空的
 * }
 * 2.无参构造函数
 * public 类 () {
 * //自定义方法内容--初始化之类的
 * }
 * 3.有参构造函数-- 如果没有显式写出默认构造函数，则不会再使用默认构造函数
 * public 类 (参数类型 名称1, 参数类型2 名称2， ...) {
 * //自定义方法体
 * //和【无参构造函数】的区别--
 * }
 * <p>
 * <p>
 * 封装---把过程和数据封装起来
 * java中，通过private、protected和public实现封装。
 * <p>
 * User()里面的属性要private声明，对数据的访问只能通过方法进行访问。
 * <p>
 * 1.类封装
 * User()类--属性age和name用private封装
 * 只能通过方法进行访问-- get和set方法访问
 * 不需要管User()里面怎么操作的
 * <p>
 * 2.方法封装
 * <p>
 * <p>
 * 重载--overload---参数不一样
 * <p>
 * 一个类里面，方法名相同，参数不同
 * 和返回类型无关
 * <p>
 * <p>
 * 重写--override---方法体不一样
 * <p>
 * 子类对父类允许访问的方法的 实现过程，进行重写
 * 返回值和形参--不可改变
 * <p>
 * this关键字
 * 当一个对象被创建--JVM给这个对象分配一个 引用自身的指针-->这个指针的名字就是 this
 * 只用于非静态方法体
 * 静态代码体&代码块不能出现this---对象的引用，静态方法是类级别的方法，不能通过对象引用。
 * this指向【当前对象】本身
 */

/**
 * 封装---把过程和数据封装起来
 * java中，通过private、protected和public实现封装。
 *
 * User()里面的属性要private声明，对数据的访问只能通过方法进行访问。
 *
 * 1.类封装
 * User()类--属性age和name用private封装
 * 只能通过方法进行访问-- get和set方法访问
 * 不需要管User()里面怎么操作的
 *
 * 2.方法封装
 *
 */

/**
 * 重载--overload---参数不一样
 *
 *一个类里面，方法名相同，参数不同
 * 和返回类型无关
 *
 */

/**
 * 重写--override---方法体不一样
 *
 *子类对父类允许访问的方法的 实现过程，进行重写
 * 返回值和形参--不可改变
 */

/**
 * this关键字
 * 当一个对象被创建--JVM给这个对象分配一个 引用自身的指针（内存地址的引用--指向内存）-->这个指针的名字就是 this
 * 只用于非静态方法体
 * 静态代码体&代码块不能出现this---对象的引用，静态方法是类级别的方法，不能通过对象引用。
 *
 * this指向【当前对象】本身
 */

/**
 * 使用场景
 * this (参数类型1，名称1）表示当前对象的构造函数
 *
 */

public class MainTest {
    public static void main(String[] args) {
//        User user = new User();  //每次使用new创建对象的时候--使用构造函数--> User() == 构造函数，和类同名
//        user.setAge(10);  //可以覆盖构造函数里面初始化的age=20 --
//        user.setName("bob");
//
//        System.out.println(user.getAge());
        test1();
        test2();
    }

    /**
     * 无参构造函数User(){}
     * 1.先创建对象user1
     * 2.set方法给对象user1赋值
     * 3.输出值
     */
    public static void test1() {
        User user1 = new User();
        user1.setName("Amy");
        user1.setAge(10);
        System.out.println(user1.getName());
    }

    /**
     * 有参构造函数User(String name, int age){}
     * 1.先给构造函数传入参数 --- String name = "二当家" ; int age = 5;
     * 2.创建对象user2
     * 3.输出值
     */
    public static void test2() {
        String name = "二当家";
        int age = 5;
        User user2 = new User(name, age);
        System.out.println(user2.getName());
    }
}

