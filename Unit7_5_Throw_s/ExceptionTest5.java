package Unit7_5_Throw_s;

/**
 * throws -- 方法的 () 之后，可抛多个，逗号隔开
 *
 * throw -- 方法内 try-catch内抛异常
 * 1.如果方法体里面要throw异常，则在方法后面要声明throws---为了编译器识别
 * 2.如果方法里面向外抛异常了---调用方法的地方也要做异常处理
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
     //divide方法里面有异常处理，抛异常---调用方也要做异常处理，不然会报错
        try{
            int result = divide(25,0);
            System.out.println("结果是"+result);
        }catch (Exception e ){
            System.out.println("main函数异常");
        }

        //       //divide方法里面有异常处理，抛异常---调用方也要做异常处理，不然会报错  int res = divide(20,1);
        //       int res = divide(20,1);

    }

    public static int divide(int num1, int num2) throws Exception{
        try{
            return num1/num2;   //省略写法，不加变量去声明
        }catch (Exception e ){
            System.out.println("出异常了");   //1.执行的时候抛异常--进入catch
            throw new Exception("参数异常");   //2.继续往外抛异常-- 要在方法声明中使用throws字句才可以继续往外抛
        }

    }
}
