package Unit14_1_CommonClass;

import java.lang.reflect.Array;
import java.util.Map;

/**
 * Math类
 *  java操作数学运算相关的类
 *  构造函数私有化，不允许创建对象
 *  都是静态方法，直接是类名.方法名 --- Math.sqrt()
 *
 * 常见API方法讲解
 *
 *
 */
public class U14_2_Math {
    public static void main(String[] args) {
        int a = 10;
        int b = 1000;
        int c = 3;
        int[] arr = {1,3,4};
        //计算平方根
       System.out.println( Math.sqrt(a));
        //立方根
        System.out.println(Math.cbrt(b));
        //计算两个数的最大
        System.out.println(Math.max(a,b));
        //ceil--向上取整，向坐标轴右靠
        System.out.println(Math.ceil(19.222));  //输出20
        //floor--向下取整，向坐标轴左靠
        System.out.println(Math.floor(19.222));  //输出19
        System.out.println(Math.floor(-19.2222)); //输出-20

        //随机数, 0<x<1的 double型数  ！【注意区间】  [0,1)
        System.out.println(Math.random());

        //随机整数！【重要】 产生1~10的随机整数
        // 产生0~1的随机数，int方法进行转换会去掉小数点后面的数字，只获得整数部分。
        System.out.println((int)(Math.random()*10+1));  //1到10的话，+1

        for(int i=0; i<20; i++){
            System.out.println((int)(Math.random()*10+1));  //加了1不会出现0，也不会出现11. 最大为10（半开区间）
        }
    }
}
