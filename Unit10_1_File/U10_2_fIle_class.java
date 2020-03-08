package Unit10_1_File;

import java.io.File;
import java.io.IOException;

/**
 * File类及其相关API
 *
 * 程序代码和文件目录的关系：对文件和目录进行 增删改查，称为CRUD。 （Create, Remove, Update, Delete)
 *
 * IO：Input/Output
 *      把内存中的数据-->持久化设备，输出，Output
 *      把持久化设备-->内存中，输入，Input
 *      输入/输出操作称为 IO操作， IO也分 网络IO、 文件IO
 *
 * java文件类File：
 *      计算机文件和目录的操作---对文件和目录的增删改查
 *      File类表示磁盘中存在的文件和目录
 *      File.separator--目录分隔符， Win和 Mac/linux不一样。
 *
 * 常见构造函数
 * 1.   //
 *
 */
public class U10_2_fIle_class {
    public static void main(String[] args) {
        String dir = "C:\\Users\\LENOVO\\Desktop\\dir";
        String name = "aaa.txt";

        //创建一个File
        File file = new File(dir,name);

        //获取文件的绝对路径
        System.out.println(file.getPath());

        //1. ---U
        //查询和判断
        System.out.println("基本路径："+file.getPath());
        //是否绝对路径
        System.out.println("是否绝对路径:"+file.isAbsolute());
        //父路径名
        System.out.println("父路径名："+file.getParent());
        //是否文件
        System.out.println("是否是一个文件"+file.isFile());
        //是否目录
        System.out.println("是否是一个目录"+file.isDirectory());
        //文件或目录是否存在
        System.out.println("文件/目录是否存在"+file.exists());

        //列出该【目录】所有文件组成的字符串
        String arr[] = file.list();
        for(String temp :arr){
            System.out.println(temp);
        }

        //创建指定目录-一层目录
        File mkdir = new File(dir+"\\dir");
        mkdir.mkdir();

        //创建多个层级目录
        File mkdirFile = new File(dir+"\\xd\\aa\\bb\\cc");
        mkdirFile.mkdirs();

        //创建一个文件----捕捉异常
        File newFile = new File(dir+"\\blala.txt");
        try{
            newFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        //删除文件。 注意：当前文件夹必须是最终最子的文件才可以删除，里面还有文件则先删除里面的文件。
        newFile.delete();
    }
}
