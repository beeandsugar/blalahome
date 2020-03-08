package Unit9_1_Iterator;

import java.util.*;

/**
 * Comparable (对比Comparator）
 * --java集合元素排序接口
 *
 * //T是泛型，如果要比较Student，则传入T-->Student
 * public interface Comparable<T>{
 *    public int compareTo<T o);
 * }
 *
 * 是一个接口，它制定排序的规则。对实现它的类 的对象进行排序，compareTo方法是实现排序的具体方法
 * 比如 TreeSet, SortedSet, Collections.sort()方法调用进行排序
 *
 *集合里面的 元素 == 对象
 *
 *
 *
 */
public class Unit9_5_Comparable{
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<User>();
        userSet.add(new User("bob",12));
        userSet.add(new User("amy",22));
        userSet.add(new User("john",29));
        userSet.add(new User("smith",8));

        List<User> userList = new ArrayList<>();
        userList.add(new User("bob",12));
        userList.add(new User("amy",22));
        userList.add(new User("john",29));
        userList.add(new User("smith",8));
        System.out.println("userList未排序："+userList);
        //排序--sort是对list-->userList
        Collections.sort(userList);
        System.out.println("排序后的List："+userList);

        //排序--

    }
}

class User implements Comparable{
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        return this.age-user.age;
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
}

