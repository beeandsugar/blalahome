package Unit6_4_extends.After;

/**
 * 作为Cat类和Dog类的父类
 * 子类拥有父类的【非private方法】--用protected
 */
public class Animal {


    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println("闭着眼睛睡觉");
    }

}
