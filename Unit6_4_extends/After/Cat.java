package Unit6_4_extends.After;

public class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }

    /**
     * @Override 重写
     * 父类中已经有的sleep()方法
     * 但是子类不想这样说---可以重写--名字相同、参数相同、方法体不同
     */
    @Override
    public void sleep(){
        System.out.println("Cat中重写父类的方法sleep()---猫白天睡觉~");
    }
}
