package Unit9_1_Iterator;

import java.util.*;

/**
 * 迭代器--一种设计模式
 *
 * 三个核心方法
 * 1. boolean hasNext()
 * 2. Object next()
 * 3. void remove()
 *    ****只有当next()执行完之后，才能调用remove()。如果要删除第一个元素，不能直接调用remove()，要先next（）否则抛异常。
 *
 * 迭代器遍历元素的时候不能通过Collection里面的remove方法，只能用【iterator】的remove方法删除。
 *    *** 原因：某个线程在Collection进行迭代时，不允许另一个线程修改该Collection。
 *    *** A.B线程同时修改某个问题会引起线程安全问题。
 *
 * 迭代的元素是引用的拷贝（指向地址），但是修改元素的时候，修改的是元素本身。
 *
 */
public class Unit9_2_Iterator_2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer output = iterator.next();
            //删除元素---用iterator的remove()
            if(output.equals(3)){
                //不能用list容器自带的remove方法
                //list.remove(1);
                iterator.remove();
             //   break; 只删除第一个3
            }
        }
        System.out.println(list);

        mapTest();
    }

    public static void mapTest(){
        Map<String,String> map = new HashMap<>();
        map.put("jack","beijing");
        map.put("bob","beijing");
        map.put("amy","beijing");
        map.put("jerry","beijing");
        map.put("tom","beijing");

        Set<Map.Entry<String,String>> entrySet = map.entrySet(); //拿到entry集合
        Iterator<Map.Entry<String,String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            String str = entry.getKey()+ "," + entry.getValue();
            System.out.println(str);
        }

    }

}
