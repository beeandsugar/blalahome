package Unit9_1_Iterator;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Collections工具类
 *      java里面关于【集合】的工具类，包含关于集合操作的静态多态方法，不能实例化(因为构造函数私有化了）。
 *      public class Collections{
 *          //私有化Collections
 *          private Collections(){ }
 *      }
 *
 * 1.Collections和Collection区别
 *      Collection是接口，提供了对集合对象进行基本操作的通用接口方法，List、Set等多种具体的实现类。
 *
 *      Collections是工具类，专门操作Collections【接口实现类里的元素】。
 *
 * 2.常用方法
 * （1）sort 排序
 *
 * （2）shuffle 随机排序
 *      应用场景：随机乱序，生成斗地主/麻将等
 *
 */
public class Unit9_3_Collections {
    public static void main(String[] args) {
        testSort();
        testShuffle();
    }

    public static void testSort(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("zzz");
        list.add("ggg");
        System.out.println(list);
        //对容器的元素进行操作---实现类List的元素 进行操作
        //默认：升序
        Collections.sort(list);
        System.out.println(list);
        //Comparator.naturalOrder() --升序
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);

        //降序
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);

        //shuffle，随机排序
    }

    public static void testShuffle(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("J");
        list.add("Q");
        list.add("K");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("shuffle后的排序："+list);
    }
}
