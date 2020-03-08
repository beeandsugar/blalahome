package Unit13_1_Date;

import java.util.Date;

/**
 * 时间日期
 * java的日期处理类--Date
 *
 * 1.时间的基础知识
 *      时期---24个时区，每个时区有自己的本地时间。
 *      为了统一，使用一个统一的时间---全球标准时间（UTC==Universal Time Coordinated)
 *      格林尼治时间---GMT
 *      北京时间---CST（China Standard Time)--属于东八区， CST = UTC+8
 * 2.时间戳【重要！】
 *      自 北京时间（CST）== 1970年1月1日（08：00:00 GMT）至当前时间的【总秒数】
 *      也称为： Unix时间戳（Unix Timestamp)
 *      广泛用于知识产权保护、合同签字、金融账务、等等
 * 3.时间---格式多种--能让用户看懂就可
 *      2020-11-20 10:11:11
 *      2010/11/20 10/10:10
 *
 * 二、程序代码怎么表示时间？如何获取当前时间？
 *
 * 三、java.util包---Date类 封装当前日期、时间
 *
 * 四、构造函数
 * //当前时间
 * Date()
 *
 * //从1970年1月1日的毫秒数作为参数
 * Date(long millisec)   --- Date(1583245035515L)
 *
 *常见方法
 * 1.获取时间戳 --- getTime()；
 *
 *
 * 【新版JDK8的时间日期处理类】---新特性
 * JDK8发布了新的Date-Time API
 * 日期、时间的比较/加减/格式化等
 * ***包所在位置： java.time *****
 *
 * 核心类：
 * LocalDate: 不包含具体时间的日期
 * LocalTime: 不含日期的时间
 * LocalDateTime: 包含了日期及时间
 *
 * LocalDate 常用API
 *
 * LocalDate today = LocalDate.now();
 * today.getYear();
 * today.getMonth();
 *
 *
 *
 */
public class U13_1_Date {
    public static void main(String[] args) {
        //是 java.util包里面的 （java.sql也有date）
        Date date = new Date();   //默认是指当前时间，CST

        System.out.println(date);  //不同时间输出不一样
        System.out.println(date.getTime());  //getTime()得到的是 时间戳（单位：毫秒）

    }

}
