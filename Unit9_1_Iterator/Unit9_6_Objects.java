package Unit9_1_Iterator;

import java.util.Date;
import java.util.Objects;

/**
 * Objects工具类--
 * JDK1.7引进的工具类。都是静态调用的方法，JDK1.8新增部分方法。
 *
 * 【重点方法】
 * 1. equals --- 字符串/包装对象的比较。 对象比较时，先比较内存地址，再比较值
 *
 * 2. deepEquals --- 数组的比较，先比较内存地址，再比较值。  如String/char/byte/int数组，或包装类型Integer等数组。
 *
 * 3. hashCode --返回对象的hashCode，若传入为 null ---返回0
 *
 * 4. hash -- 传入可变参数的所有值的hashCode总和， 底层调用Arrays.hashCode
 *
 *【可变参数】--可以传多个类型的参数
 * public static int hash(Objects...value){
 *      return Arrays.hashCode(values);
 * }
 *
 *
 */
public class Unit9_6_Objects {
    public static void main(String[] args) {
        //1.equals方法---比较String或数组，返回类型boolean
        String str1 = "javase demo1";
        String str2 = "javese demo2";
        System.out.println(Objects.equals(str1,str2));  //===false

        //2.deepEquals ---比较数组
        String [] arr1 = {"aa","bb","cc"};   //【注意】 数组是用大括号{ }
        String [] arr2 = {"aa","bb","cc"};
        System.out.println(Objects.equals(arr1,arr2));   // ---false ---> 内存地址不一样。
        System.out.println(Objects.deepEquals(arr1,arr2));  //---true --数组的比较要用deepEquals

        //3.hashCode
        System.out.println(Objects.hashCode("xdclass.net"));
        System.out.println(Objects.hashCode("xdclassnet"));
        System.out.println(Objects.hashCode("blala.blala.bla"));

        //4.hash  --- 可变参数，可多种类型，返回的是hashCode之和。
        System.out.println(Objects.hash("xdclass",new Date(),12,33L));
    }
}
