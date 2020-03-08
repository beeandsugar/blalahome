package Unit14_1_CommonClass;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装类型
 *
 * 基础类型     包装器类型
 *  boolean     Boolean
 *  char        Character  ***
 *  int         Integer ***
 *  byte        Byte
 *  short       Short
 *  long        Long
 *  float       Float
 *  double      Double
 *
 *  面试题---
 *    基本数据类型和包装数据类型的区别
 *      1.基本数据类型不需要new，包装类型需要用new关键字在堆中分配存储空间。
 *      2.存储方式和位置不同，基本数据类型是将变量值存储在栈中，包装类型是将对象放在堆中。通过引用来使用
 *      3.初始值不同，基本类型的初始值如int为0，boolean为false----包装类型的初始值为null。
 *
 */
public class U14_5_Wrapper {
    //验证基本数据类型和包装类型的初始值

    //基本数据类型
    private static float rst1;
    private static Float rst2;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //List<>里面必须是对象，不能是基本数据类型。 int不行--Integer可；

        //基本数据类型--->包装类型
        int i1 = 0;
        Integer integer1 = new Integer(i1);
        Integer integer2 = new Integer(2);
        Boolean booleanObj = new Boolean(false);

        //包装对象-->基本数据类型
        int a = integer1.intValue();
        boolean b = booleanObj.booleanValue();


        System.out.println(rst1);   //初始化int==0
        System.out.println(rst2);   //初始化Integer==null

    }
}
