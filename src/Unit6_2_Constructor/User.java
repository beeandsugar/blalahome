package Unit6_2_Constructor;



/**
 *
 */
public class User {
    private int age;

    private String name;

    public String getName() {
        return name;
    }

    /**
     * 在方法里面使用this--表示指向当前的对象
     * @param name
     */
    public void setName(String name) {
        this.name = name;   //形参传递的age 和 当前this.age 不一样
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /**
     * User类的无参构造函数
     */
    public User(){  //可以private User()--不让外部调用创建对象
        this("Smith",60);  //构造函数之间可以互相调用，但是务必写在方法第一行
        System.out.println("这是一个构造函数");
        this.age = 20; //初始化User的年龄
    }

    /**
     *
     * User类的有参构造函数
     *
     * 可以写两个构造函数
     * 一旦写了有参构造函数，则不会提供默认构造函数（无参）
     * 如果需要用到默认的构造函数，需要显式地写出来
     * @param name
     * @param age
     */
     public User(String name, int age){
        this.name = name;      //this可以指向构造函数
        this.age = age;
        //方法形参（int age是传入的）和对象的属性重名---用this来区分--> this.age是当前对象的属性; age是方法的形参
     }

    /**
     * 重载
     *
     * 方法名一样--sleep()
     * 参数不一样
     */
    public void sleep(){
        System.out.println("睡觉1");

        String name = this.getName();  // this指向当前的方法

        String name2 = this.name ;  // this指向当前的对象
     }

     public void sleep(String address){
        System.out.println(address);
        System.out.println("睡觉--重载");
     }


     public static void run(){
        // this.age;   //不能被引用到静态方法 ---静态方法存在的时候，对象不一定存在，因为可以不创建对象直接访问方法。
     }

}
