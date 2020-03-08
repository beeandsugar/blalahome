package Unit9_1_Iterator;

import java.util.*;

/**
 * 迭代器
 *
 * 是java的一个接口，核心作用：遍历容器的元素
 * 当容器实现了Iterator接口后，通过调用Iterator()方法获取一个Iterator对象。
 *
 * 为什么是Iterator()方法---
 *      容器的实现有很多种，不同容器遍历规则不一样，ArrayList/LinkedList/HashSet/TreeSet等
 *      所以设计了Iterator接口，让容器自己去实现接口，实现里面的方法。--开发人员不需要操心实现
 *
 * 三个核心方法
 * 1. boolean hasNext() --判断是否有下一个元素
 *
 * 2.Object next() --返回iterator的下一个元素，指针后移一位
 *
 * 3.void remove() --删除指针的上一个元素（易错，删除元素建议不使用容器自己的方法）
 *
 *和for循环的区别
 *  for循环适合顺序访问或下标访问
 *  迭代器适合链式结构
 *
 *
 */
public class Unit9_1_Iterator {
    public static void main(String[] args) {
        //Iterable<> 顶级接口
        //遍历ArrayList
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();

        //举例 遍历HashSet
//        testSet();
        testList();
    }

    public static void testSet(){
     //   Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("jack");
        set.add("bob");
        set.add("amy");
        set.add("tony");
        set.add("mom");

        //容器里面是<String>--->迭代器<String>
        //容器：set 方法:iterator
        Iterator<String>  iterator = set.iterator();

        //判断是否还有下一个，true的时候才继续迭代
        while( iterator.hasNext() ){
            String str = iterator.next();
            System.out.println(str);
        }
    }

    public static void testList(){
        List<String> list = new LinkedList<>();
        list.add("bob");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //iterator的创建需要在list.add部署之后。--否则会报错ConcurrentModificationException
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String output = iterator.next();
            System.out.println(output);
        }
    }

}
