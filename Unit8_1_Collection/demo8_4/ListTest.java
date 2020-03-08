package Unit8_1_Collection.demo8_4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ArrayList
 *面试题
 * 1.ArrayList和LinkedList区别
 *      两个都是list的接口，都是非线程安全的。
 *      ArrayList是基于动态数组的数据结构，LinkedList基于链表的数据结构。
 *      对于随机访问get和set（查询操作），ArrayList优于LinkedList。因为LinkedList要移动指针。---适用于频繁查询
 *      对于增删操作（add, remove)，LinkedList。---不用移动很多元素，只移动上下两个元素// ArrayList移动所有元素。  ---适用频繁增删。
 *
 */
public class ListTest {
    public static void main(String[] args) {

        //容器ArrayList<>
        ArrayList<String> arrayList = new ArrayList<String>();   // <>里面写要装的对象的类型，<>也可以不声明（新版JDK）
        LinkedList<String> linkedList = new LinkedList<>();

        //arrayList.add(元素值) 向容器添加元素
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("bob");
        System.out.println(arrayList);  //输出 [jack,tom,bob]

        //查 --- 索引
        System.out.println(arrayList.get(1));   // arrayList.get(索引)   输出第二个，tom

        //arrayList.set(索引，元素值) 更新元素
        arrayList.set(0,"Mike");
        System.out.println(arrayList);

        //arrayList.remove(元素对象) 根据对象删除对象元素
        arrayList.remove(0);
        System.out.println(arrayList);

        //arrayList.remove(索引值) 根据索引删除元素
        arrayList.remove("tom");
        System.out.println(arrayList);

        //arrayList.clear() //清空元素---无返回，仅操作
        arrayList.clear();
        System.out.println(arrayList);

        //判断arrayList目前容器是否为空---boolean
        boolean or = arrayList.isEmpty();
        System.out.println(or);


    }
}
