package Unit9_1_Iterator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 重写HashCode和Equals方法
 *
 * 1.HashCode --- 顶级类Object里面的native方法，所有的类都是继承Object类
 *   返回: int 类型  (-14929878911)
 *   根据一定的hash规则（存储地址、字段、长度等），映射成一个数值---散列值
 *   越复杂余越难匹配，唯一性越强
 *
 * 2.Equals --- 也是顶级类Object里面的方法，
 *   返回： boolean
 *   根据自定义匹配规则，用于匹配两个【对象】是否一样。
 *   一般逻辑：
 *      //判断地址是否一样
 *      //非空判断、class类型判断
 *      //强转
 *      //对象里面的字段一一匹配
 *
 * 【怎么重写】
 * 1. Generate-->Overwrite Method重写方法
 * 2. 在类里面重写
 *
 * 【应用场景】
 * 当向集合中（如：Set）插入对象时，如何判别在集合中是否已经存在该对象，确保存储对象的唯一，并判断是不是同一个对象？
 * 1. 依据hashCode和equals进行判断 --- 所以Set的存储对象对应的类，必须重写这两个方法
 * 2. 判断两个对象是否一样，首先判断插入obj的hashcode值是否存在---非空判断；
 *      a. 若不存在hashCode，则直接插入集合；
 *      b. 若存在，进行equals方法判断是否相等。
 *
 */
public class Unit9_7_HashCode_Equals {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("bob",21));
        personSet.add(new Person("jack",30));
        //进行排除重复项--当重写了hashCode和equals
        personSet.add(new Person("mia",17));
        personSet.add(new Person("mia",17));
        System.out.println("集合输出："+personSet);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age ){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //如果不写toString方法，则输出对象为 Person@xxx
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}