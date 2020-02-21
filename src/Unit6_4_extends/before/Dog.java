package Unit6_4_extends.before;

/**
 * Cat和Dog都有
 * 相同的属性--name和age
 * 相同的方法--sleep和eat
 *
 * --->继承父类 Animals
 *把相同部分的属性和方法写在父类里面
 *子类可以用【自己的方式】实现父类的方法
 */
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println("狗狗睡觉");
    }

    public void eat(){
        System.out.println("狗狗吃鱼");
    }


}
