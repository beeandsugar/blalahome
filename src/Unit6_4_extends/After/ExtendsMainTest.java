package Unit6_4_extends.After;

public class ExtendsMainTest {
    public static void main(String[] args) {

        Dog dog = new Dog();  //键入的时候选择after包里面的Dog类（继承了父类的）
        dog.age = 10;   //不允许
        dog.name = "ddd";   //不允许
        dog.setAge(10);   // 通过set方法设置 √
        dog.setName("douduoduo");
        System.out.println(dog.getAge()+dog.getName());
        dog.test1();   //test1()方法里面用了super指向父类的sleep()方法
        dog.eat();

    }
}
