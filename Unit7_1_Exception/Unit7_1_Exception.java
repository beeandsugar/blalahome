package Unit7_1_Exception;

/**
 * 什么是错误--不被期望的事件且阻止了程序预期的正常运行
 * 常见程序错误【三类】
 * 1. 编译错误--大小写/空格/括号 等 --编译不通过 有提示
 * 2. 运行时错误--网络连接/文件查找不存在/读取文件问题 等
 * 3. 逻辑错误
 *
 * java.lang软件包--java.lang.Throwable类---java中所有的错误/异常的【超类】
 * java.lang.Throwable 两个子类 == Error和Exception
 * 一、Error
 * · 包含了大量子类
 * · 出错后程序无法处理的 --如 OutOfMemoryError（内存溢出）
 * 二、Exception
 * · 包含大量子类
 * · 程序可以处理的异常--ArrayIndexOutOfBoundsException
 *
 * 【两大类】
 * · 可查异常 --- 编译器要求必须处置： RuntimeException及其子类以外的
 * ** 抛可查异常--提示
 *
 * · 不可查异常 --- 编译器不要求强制处置的异常： RuntimeException与其子类 和 Error， e.g. ArrayIndexOutOfBoundsException
 * *** 要去做预先判断，防止可能出现的不可查异常。比如数组长度判断
 *
 */

/**
 * java内置的异常、核心方法
 *
 * Throwable-顶级类
 * Error  &&        Exception
 *          IOException   RuntimeException
 *           可查异常         不可查异常
 *
 * 【可查异常】---必须在方法里面捕获or抛出
 * ** ClassNotFoundException 应用程序在试图加载类--找不到类
 * ** IllegalAccessException 拒绝访问一个类--非法访问
 * ** NoSuchFieldException 请求的变量不存在
 * ** NoSuchMethodException 方法不存在
 *
 * 【不可查异常】
 * ** ArrayIndexOutOfBoundsException 数组索引越界
 * ** ClassCastException 强制失败抛出异常
 * ** NullPointerException 需要对象的地方使用null，抛出
 * ** NumberFormatException 将字符串转换成一种数值类型，但该字符串不能转换为适当格式--抛出异常
 *
 */

/**
 * Throwable类核心方法
 * public String getMessage() --- 异常的详细信息
 * public String getCause() ---异常的原因
 * public void printStackTrace() --- 打印错误的堆栈信息，即错误输出流---错误原因和位置
 * public StackTraceElement[] getStackTrace()---堆栈层次的数组，下标为0的元素代表栈顶。
 */

public class Unit7_1_Exception{
}
