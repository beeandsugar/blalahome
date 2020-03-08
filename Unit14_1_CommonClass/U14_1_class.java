package Unit14_1_CommonClass;

/**
 * 常见class类
 *
 * 一、java顶级对象 -- Objects对象
 *
 * 1.什么是Object类
 *      --位于java.lang包。  java.lang包，包含着java最基础、最核心的类，编译时自动导入。
 *      --Object类是所有java类的祖先，每个类都使用Object类作为超类（父类）
 *
 * 2.常用方法
 *  //获取对象运行时class对象，即 描述对象所属类的对象。获取该类的基本信息，包、名、方法等
 *  public final native class<?> getClass()
 *
 *  //获取对象的散列值 ---防止重复放入数据
 *  public native int hashCode()
 *
 *  //比较两个对象，如果引用指向同一个对象--返回true
 *  public boolean equals(Object obj)
 *
 * //可代表对象的字符串，默认返回格式是 class名+@+hashCode---不方便看
 * public String toString()
 *
 * 3. native方法 --- 本地方法，具体是用C（C++)在DLL中实现的，通过JNI调用
 * 4. JNI == Java Native Interface（本地接口） -- Java和本地C（C++)代码进行互操作的API，偏向于底层
 *
 */
public class U14_1_class {
    private String name;
    private int age;
    public static void read(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Class clazz = new U14_1_class().getClass();   //获取这个类的信息--方法、名字、等等
        System.out.println(clazz.getName());  //获取这个类的名字


    }
}
