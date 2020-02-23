package Unit7_3_TryCatch.demo;

public class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("参数异常");   //自己设置--向外抛异常
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
