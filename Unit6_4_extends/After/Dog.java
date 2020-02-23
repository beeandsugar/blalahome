package Unit6_4_extends.After;

public class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃肉");
    }

    /**
     * 重写--覆盖--父类已有的sleep()
     * 方法名、参数、返回类型必须一致
     * 方法体不同
     */
    @Override
    public void sleep(){
        System.out.println("重写父类的方法sleep()---狗狗睡觉~");
    }

    /**
     * 已经重写了sleep(){} --默认调用子类里面的方法
     * 如果想调用父类里面的sleep()方法--- 用super指向父类。
     *
     */
        public void test1(){
            super.sleep();
        }



}
