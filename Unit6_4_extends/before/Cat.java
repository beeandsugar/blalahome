package Unit6_4_extends.before;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println("猫猫睡觉");
    }

    public void eat(){
        System.out.println("猫猫吃鱼");
    }


}
