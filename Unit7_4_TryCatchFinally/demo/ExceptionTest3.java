package Unit7_4_TryCatchFinally.demo;

public class ExceptionTest3 {
    public static void main(String[] args) {
        int result = divide(25, 2);
        System.out.println("结果=" + result);
    }

    public static int divide(int num1, int num2) {
        try{
            int result = num1/num2;
            return result;
        }catch (Exception e ){
            System.out.println("异常！");
        }finally {
            System.out.println("finally执行指令--");
            return -2;     //finally有无异常都会执行，返回的-2优先于result（5）
        }
    }
}