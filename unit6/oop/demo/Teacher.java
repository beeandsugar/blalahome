package unit6.oop.demo;

/**
 * Teacher类
 */
public class Teacher {

    //属性
    private int age; //对象的属性一般都是--private--通过get&set方法获取

    private String name;

    private int sex; //可定义0 1 表示男女

    //方法
    public void teach(){
        System.out.println("教学");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

}
