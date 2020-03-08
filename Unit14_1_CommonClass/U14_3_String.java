package Unit14_1_CommonClass;

/**
 * String 字符串对象
 *      1.是对象，不是简单数据类型
 *      2.封装在java.lang包，自动导入
 *
 * 创建字符串对象
 *      方法一：
 *      String str = new String("hello");
 *      方法2
 *      String str = "hello";
 *
 * 判断字符串是否相等--【重要】
 *  1.比较内容 要用 equals
 *      Str1.equals(Str2);   //boolean
 *  2.比较地址 用 ==
 *
 * 【常见API】
 *
 */
public class U14_3_String {
    public static void main(String[] args) {
        //每次new,地址不一样
        String str1 = new String("blala");
        //直接创建，如果再创建重复的内容，则会查找是否已有这样的字符串，若有，把地址共用
        String str2 = "blala";
        String str3 = "blala";

        System.out.println("比较地址，用==，结果："+(str1==str2));   //false
        System.out.println("比较内容，用equals.结果："+(str1.equals(str2)));  //true
        System.out.println("内容一样的23，地址是否相等？--"+(str2==str3));  //true

        //常见API

        //通过下标获取字符
        char ch = str1.charAt(5);

        //获取字符串长度---str.length();
        System.out.println(str1.length());

        //字符串比较--忽略大小写
        boolean result = str1.equalsIgnoreCase(str1);

        //查找字符串出现的位置
        int index = str1.indexOf(".");
        System.out.println(index);

        //字符串截取
        String rst1 = str1.substring(index);
        String rst2 = str2.substring(1,3);

        //字符串拆分
        String[] arr = str1.split(".");
        System.out.println(arr);

        //字符串替换
        String after = str1.replace("a","b");

        //大小写转换
        System.out.println(str1.toLowerCase());  //小写
        System.out.println(str2.toUpperCase());  //大写

        //去掉空格
        System.out.println(str1.trim());

        //字符串类型---->布尔类型
        boolean bool = Boolean.getBoolean("banana");
        System.out.println(bool);

        //字符串--->整型
        int integer = Integer.parseInt("20");

        //字符串-->Long
        Long longRst = Long.parseLong("20");

        //字符串-->单精度浮点型，双精度浮点型
        float f = Float.parseFloat("20.2");
        double d = Double.parseDouble("20.2222");

    }

}
