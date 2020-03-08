package Unit11_1_IO;

import java.io.*;

/**
 * 缓冲Buffer 输入输出流 --- 本质：增加内存中的缓冲区，减少磁盘的IO提高效率
 * 0. 缓冲--- 内存空间的一部分，在内存空间中预留了一定的存储空间，用来缓冲输入或输出的数据，这部分空间叫缓冲区（具有一定大小）
 * 【作用】
 *   a. 操作磁盘比内存慢得多，如果没有缓冲区---效率很低
 *   b. 数据传输速度和数据处理存在不平衡 --- 从每秒写多次硬盘，变成很多秒写一次硬盘，数据送往缓冲区---高速设备不用等待低速设备
 *      对系统冲击小，写入效率高。
 *
 *  Java--IO包里面的两个缓冲类（高级流）==BufferInputStream和BufferOutputStream
 *  *** 采用包装设计模式（锦上添花~）
 *
 * 1.缓冲输入流 BufferInputStream
 *      预先读入一整段原始输入流数据至缓冲区中---外界对BufferInputStream实际上在缓冲区进行，如果读取的数据超过了缓冲区，
 *      则重新从原始的输入流中载入下一截数据填充缓冲区，然后外界继续通过缓冲区，进行数据读取。
 * 【优点】
 *      避免了大量的磁盘IO，原始的InputStream类实现的read是即时读取的，每一次读取都是一次磁盘的IO操作（哪怕只是1字节数据）
 *      如果数据量巨大，磁盘消耗很可怕
 * 【缓冲区的实现】
 *      读取可以读取缓冲区中的内容，当读取超过缓冲区的内容后，再进行一次【磁盘IO】，载入一段数据填充缓冲，下一次读取时---直接从缓冲区读取，减少了磁盘IO。
 *【缓冲区大小】
 *      常见：8k,  int DEFAULT_BUFFER_SIZE = 8192;
 * 【常见构造函数】
 *      //对输入流进行包装，默认缓冲区：8k
 *      public BufferedInputStream(InputStream in);
 *
 *      //对输入流进行包装，指定创建具有指定缓冲区大小的
 *      public BufferedInputStream(InputStream in,int size)
 * 【常用的两个方法】
 *      //从输入流中 读取一个字节
 *      public int read();
 *      //从字节输入流中给定偏移量处开始将各字节读取到指定的 byte 数组中
 *      public int read(byte[] buf, int off, int len);
 *      //关闭，释放资源
 *      void close();
 *
 * 2.缓冲输出流 BufferOutputStream
 *
 * 【常用的三个方法】
 *      //向输出流 输出一个字节
 *      public void write(int b);
 *
 *      //将指定byte数组中从 偏移量off 开始的 len个
 *      public void write(byte[] buf,int off,int len);
 *
 *      //刷新输出流，强制使 所有缓冲的输出字节 被写出到底层输出流中。
 *      public void flush();  //在不调用close（）的情况下，缓冲区不满，又需要把缓冲区的内容写入文件，或发送到别的机器时才需要flush
 *
 *      //关闭释放资源 -- 此时会自动flush
 *      void close();
 *
 */
public class U11_4_Buffer {
    public static void main(String[] args) throws IOException {   //抛异常可以在方法声明处，也可以在try{}catch(){}
        //e.g. 用缓冲输入输出完成文件的拷贝

        String dir = "C:\\Users\\LENOVO\\Desktop\\";
        String original = "a.txt";
        String target = "bufferTestTarget.txt";

//        try{

            //先new一个原始输入流
            FileInputStream fis = new FileInputStream(dir+original);
            //new一个缓冲输入流
            BufferedInputStream bis = new BufferedInputStream(fis);
            //new一个输出流
            FileOutputStream fos = new FileOutputStream(dir+target);  //自动创建文件
            //new一个缓冲输出流
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //size用来限制读取输入流 ( size = bis.read(buf) )
            int size;
            // buf == 能够读取的最大数值
            byte[] buf = new byte[1024];

            //循环读取
            while((size = bis.read(buf)) != -1){
                bos.write(buf,0,size);
            };

            //刷新缓冲区域的输出流，才可以保证数据全部输出完成 --- 【！】
            //bos.flush();

            //close 会自动刷新缓冲区域
            bis.close();
            bos.close();

//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
