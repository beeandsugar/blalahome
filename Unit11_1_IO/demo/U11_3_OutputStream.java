package Unit11_1_IO.demo;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Field;

/**
 * OutputStream 输出字节流的父类---抽象类
 *
 * 常用方法
 * 1. void write(int b) --- 将指定的字节写入输出流
 *
 * 2. void write(byte[] b)throws IOException --- 将b.length个字节的byte数组写出当前输出流
 *
 * 3. void flush() throws IOException ---
 * write()是写在缓冲区中，当缓冲区满时，系统会自动将缓冲区的内容写入文件，但还有一部分可能会留在内存这个缓冲区中
 * 所以调用flush空缓冲区数据
 *
 * 4. void close() throws IOException --- 关闭输入流，并释放与之相关的系统资源
 *
 *常见子类
 * FileOutputStream --- OutputStream用来具体实现类的创建对象
 * 文件字节输出流
 * 对文件数据以字节的形式 输出
 *
 * 构造函数
 *      //传入输出的文件地址
 *      public FileOutputStream(String name)
 *
 *      //传入目标输出的文件对象
 *      public FileOutputStream(File file)
 *
 *      //传入目标输出的文件对象，是否可以追加内容
 *      public FileOutputStream(File file, boolean append)
 *
 * 【应用场景】
 * 1. 文件拷贝 --- 输入输出流
 *      //字母数字--- read()
 *      //含中文 --- read(byte[] buf)
 *
 */
public class U11_3_OutputStream {
    public static void main(String[] args) throws IOException {
        String dir = "C:\\Users\\LENOVO\\Desktop\\";
        String name = "a.txt";

        //不能创建目录下的文件
//        String target = "\\aa\\bb\\cc\\C.txt";
        //只能创建文件
        String target = "c.txt";

        File file = new File(dir,name);

        //将file放进去，new文件输入流
        InputStream inputStream = new FileInputStream(file);

        // dir(前缀地址) + File.separator(地址分隔符\) + target
        // 输出的时候自动检查，若没有---自动创建，不覆盖文件。
        //但只能创建文件，不能创建目录。
        OutputStream outputStream = new FileOutputStream(dir+File.separator+target);

//        testOut(inputStream,outputStream);
        testOutByBuf(inputStream,outputStream);
    }

    //单个字节读取，如果读的是中文 会有问题
    //把a.txt读出来---> b.txt去
    public static void testOut(InputStream inputStream,OutputStream outputStream) throws IOException{
        int value = 0;
        while(value != -1) {
            value = inputStream.read();
            outputStream.write(value);
        }
        //最后要关闭流
        inputStream.close();
        outputStream.close();
        }

        public static void testOutByBuf(InputStream inputStream, OutputStream outputStream)throws IOException{
          byte[] buf = new byte[1024];
          int length ;
          while ((length = inputStream.read(buf)) != -1){
              outputStream.write(buf,0,length);
          }
          outputStream.close();
        }

    }


