package Unit7_3_TryCatch.demo;


public class ExceptionTest2 {
    public static void main(String[] args) {
//        try{
//            int result = 30/0;
//
//            System.out.println("正常执行");
//            System.out.println(result);
//        }catch (Exception e ){   //Exception下面还有很多类，但一般用顶级Exception
//            //如果知道它是精确某一个异常--可写确切的类
//            System.out.println("进入Exception块");
//            e.printStackTrace();  //打印堆栈信息
//            System.out.println("结束");
//        }

    test();

    }
    public static void test(){
        try{
            Student student = new Student();
            student.setAge(-1);
        }catch (NullPointerException e){
            System.out.println("出异常了");
        }
        //当没有捕捉到设定的异常的时候---默认打印堆栈信息

//        catch (IllegalArgumentException e){
//            System.out.println("出异常--非法输入");
//        }

    }
}
