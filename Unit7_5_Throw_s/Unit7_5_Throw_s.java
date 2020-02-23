package Unit7_5_Throw_s;

/**
 * Throw和Throws
 *
 * 1.Throws -- 放在方法的参数列表() 之后 ，可以声明抛出多个异常，异常与异常用，隔开
 * public static void read() throws IOException, RemoteException{
 *     int input = System.in.read();
 * }
 *
 *
 * 2.Throw -- 方法里面的
 *   try-catch中捕获了异常，处理方法
 * A.当前捕获自己处理
 * B.捕获自己处理，然后用Throws继续往外抛异常
 *  throw new ExceptionName("异常信息");

 *  throw new IOException("File not found");
 *
 */

public class Unit7_5_Throw_s {
}
