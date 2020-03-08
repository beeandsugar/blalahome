package Unit14_1_CommonClass;

/**
 * System类 --- final
 *     **位于java.lang包，是系统类，代表程序所在系统，提供了对应的一些系统属性信息和操作。
 *     **final类型，构造函数被私有化。
 *
 * 常用API
 *      //输入输出，三个成员变量----in.out.err
 *      System.out  //常用于调试 --- 企业开发
 *      System.in //用于数据读取，少用 --几乎用不到
 *      System.err //错误输出，少用
 *
 *      //获取系统当前  毫秒值
 *      System.currentTimeMillis()
 *
 *      //获取系统环境的属性
 *      System.getProperties()
 *
 *      //根据指定key获取系统属性
 *      System.getProperties(key);
 *
 */
public class U14_4_System {
    public static void main(String[] args) {

        //输出--print不换行， println换行。

        //毫秒值---即 时间戳
        System.out.println(".currentTimeMillis获取当前系统毫秒值："+System.currentTimeMillis());

        //获取系统环境的属性---环境变量，JDK配置，系统名称os.name，等。
        System.out.println(".getProperties获取系统环境的属性"+System.getProperties());

        //
        System.out.println("获取单个Property,输入属性名。如os.name"+System.getProperty("os.name"));

    }
}
