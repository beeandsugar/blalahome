package Unit9_1_Iterator;

import java.text.CollationElementIterator;
import java.util.*;

/**
 * Collections--2
 *
 *  1. 获取最大元素max --- Student maxAgeStudent = Collections.max(list, new Comparator<Student>()
 *  2. 获取最小元素min --- ..... Collections.min(list, new Comparator<Student>()
 *
 *  3. 设置为只读集合 --- Collections.unmodifiableset/map/list
 *  list.add("xx");
 *  list = Collections.unmodifiablelist(list);  //设置为 unmodifiablelist
 *
 */
public class Unit9_4_Collections_2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();


        list.add(new Student("jack",20));
        list.add(new Student("bob",21));
        list.add(new Student("tom",13));
        list.add(new Student("jerry",2));
        list.add(new Student("jim",5));
        System.out.println(list.toString());

        //设置为只读集合
        list = Collections.unmodifiableList(list);


        //Collections用法
        //获取最大元素--Collections.max(list, new Comparator< xxx >()
        Student maxAgeStudent = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getAge() - t1.getAge();
            }
        });

        //获取最小元素--  Collections.min(list, new Comparator< xxx >()
        Student mingAgeStudent = Collections.min(list, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getAge()-t1.getAge();
            }
        });

        System.out.println("年龄最大的学生是："+maxAgeStudent);
        System.out.println("年龄最小的学生是:"+mingAgeStudent);

        Set<String> set = new HashSet<>();
        set.add("mysql");
        set.add("git");
        set.add("linux");
        //设置为只读的set
        set = Collections.unmodifiableSet(set);
        System.out.println(set);

        Map<String,String> map = new HashMap<>();
        map.put("key1","le1");
        map.put("key2","le2");
        //设置为只读的map
        map = Collections.unmodifiableMap(map);
        System.out.println(map);

    }
}

class Student{

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

    //构造函数
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //把Student打印出来
    //把每个属性拼装成String
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}