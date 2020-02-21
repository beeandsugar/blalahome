package unit5.basicGrammer;


/**
 * static静态代码块和静态方法
 *
 * static关键字
 * 优先于对象执行--内存中，先有static修饰的内容，后有对象的内容
 * static 类的成员方法/成员变量 ---从类的层面去访问。不用通过对象
 *
 * 【静态变量，非静态变量，区别】
 * 静态变量：类所拥有的的，被所有对象共享---不管创建多少个对象（10个学生）--内存中也只有一个age
 *             当且仅当 在{类}被初次加载的时候 初始化 （而非对象建立时）
 * 非静态变量：对象所拥有的，创建对象的时候 初始化，存在多个副本，各个对象拥有的副本互不影响。
 *
 * 【总结】
 * 建立一个对象
 * name （无static） 是 对象.name --- 每个对象name不一样
 * age (static) 是  类.age --- 被所有的对象共享，在内存中只有一份 -- 都是10岁
 *
 *【静态方法】
 * 不依赖于任何对象就可以进行访问。  类.方法 = Student.sleep();
 *  static 方法 不可以访问 非静态方法/变量 --- static先有，对象不一定有。
 *
 * 【静态代码块】
 * 加载类的时候，静态代码块 会且仅会被 执行一次
 * 静态代码比构造方法先执行 ---静态内容优先于非静态内容！
 * ---使用场景---
 * 一次性对静态成员变量赋值；
 * 类资源初始化；
 */



public class StaticTest {
/*    static int age;   //类变量，可以通过 类名.变量 = StaticTest.age 访问

    static void sleep(){
        //类方法， 可以通过 类名.方法 = StaticTest.sleep() 访问
    }*/


    public static void main(String[] args){

        Student.age = 10;   //age由于是static 所以用 类.age 来调用

        Student student1 = new Student();
        student1.name = "aa";

        Student student2 = new Student();
        student2.name = "bb";

        Student student3 = new Student();
        student3.name = "cc";

        System.out.println(student1.name);
        System.out.println(student1.getAge());
        System.out.println(student2.name);
        System.out.println(student2.getAge());
        System.out.println(student3.name);
        System.out.println(student3.getAge());

     }
}
