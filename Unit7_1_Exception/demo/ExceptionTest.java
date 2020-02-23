package Unit7_1_Exception.demo;

public class ExceptionTest {
    public static void main(String[] args) {
        //0不能作为除数 --- 抛异常
        //把它放在 try catch 里
        try{
            int result = 20/0;
            System.out.println(result);
        }catch (Exception e){
//            e.printStackTrace();// * public void printStackTrace() --- 打印错误的堆栈信息，即错误输出流---错误原因和位置
            String msg = e.getMessage();
            StackTraceElement [] array = e.getStackTrace();
            e.printStackTrace();
        }
    }
}
