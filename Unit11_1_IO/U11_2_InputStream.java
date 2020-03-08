package Unit11_1_IO;

import java.io.*;

/**
 * InputStream---输入字节流的父类，抽象类（一般不用） ---一般用子类
 *
 * 常见方法（类比水龙头流水滴）：
 *
 * int read() --- 从输入流中，读取单个字节，返回0~255 int。字节数据可直接转换为int
 * 如果已经到达数据流的尾部，而没有可用的字节，则返回-1
 *
 * int read(byte[] buf)---从输入流中读取一定数量的字节，存储在 缓冲区数组buf中，返回实际读取的字节数
 *
 * long skip(long n) --- 从输入流中跳过并丢弃n个字节的数据
 *
 * int available() --- 返回该输入流中有多少字节数-->可把buf数组长度定为这个
 *
 * void close() throws IOException --- 关闭输入流并释放与之相关的 系统资源
 *
 * 2. 常见子类
 *
 * FileInputStream()
 *
 */
public class U11_2_InputStream {
    public static void main(String[] args) throws IOException {
        String dir = "C:\\Users\\LENOVO\\Desktop\\";
        String name = "a.txt";

        //参数String/File --- 传file进去
        File file = new File(dir, name);   //这是新建一个File对象---不是创建文件本身
        //判断该对象对应的文件是否已经存在---若不存在，则createNewFile创建
        System.out.println("文件是否存在？"+file.exists());
        System.out.println("新建该文件"+file.createNewFile());

        InputStream inputStream = new FileInputStream(file);
//        testRead(inputStream);
//        testSkip(inputStream);
        testReadByteArr(inputStream);
    }
        public static void testRead(InputStream inputStream)throws IOException {
            int read = inputStream.read();
            //读取单个字节返回int
            System.out.println(read);
            //强转为char---字母ok--如果首字为中文--不止一字节，显示不完全。
            System.out.println((char)read);
    }

            public static void testSkip(InputStream inputStream) throws IOException{
                //跳过12个字节
                long readSkip = inputStream.skip(12);
                int read = inputStream.read();
                System.out.println(read);
                System.out.println((char)read);
            }

            //重要！重要！重要！
            public static void testReadByteArr(InputStream inputStream)throws IOException{
            //如果buf的长度为0，则不读取任何字节，并返回0. 每次读取的字节数最多 == buf长度
            byte[] buf = new byte[4];

            //循环读取文件内容
                // 引入一个length, 输入流最多buf.length个字节数据存入buf数组中
            int length;
            while((length = inputStream.read(buf)) != -1){
                System.out.println(new String(buf,0,length));

                //可进行编码 ---- 选择字符集
                // 中文乱码问题--若操作内容多，则BGK（中英文都是2字节）；  若干英文内容多，则UTF-8(编码英文1字节，中文3个字节）
                System.out.println(new String(buf,0,length,"UTF-8"));
            }
            }
    }


