package Unit12_1_Reader_Writer;

import java.io.*;

/**
 * （不常用）
 * Reader 输入字符流的父类---抽象类 // 部分库不推荐使用Reader/Writer
 *
 * 方法
 *
 * //一个字符一个字符地读---【只能操作文本】
 * int read()
 * //从输入字符流读取一定数量的字符，存储在缓冲区数组cbuf中
 * int read(char buf[])
 * //关闭 释放系统资源
 * void close() throws IOException
 *
 * 常见子类
 *   FileReader
 *   FileWriter
 *
 */
public class U12_1_Reader {
    public static void main(String[] args) throws Exception {
//        testRead();
        test2();
    }

    public static void testRead() throws Exception{
        String dir = "C:\\Users\\LENOVO\\Desktop\\";
        String test = "b.txt";
        File file = new File(dir+test);
        Reader input = new FileReader(file);

        //开始读取
        int ch;
        while((ch = input.read()) != -1){
            System.out.print((char)ch);
        }
        input.close();
    }

    public static void test2() throws Exception{
        String dir = "C:\\Users\\LENOVO\\Desktop\\";
        String test = "a.txt";
        File file = new File(dir+test);
        Reader input = new FileReader(file);

        char c[] = new char[1024];
        int len = input.read(c);

        input.close();
        System.out.println("内容为"+new String(c,0,len));

    }

}
