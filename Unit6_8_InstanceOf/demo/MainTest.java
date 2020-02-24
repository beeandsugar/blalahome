package Unit6_8_InstanceOf.demo;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student();
        boolean result = student instanceof Student; //student实例是否实现了Student类--true
        System.out.println(result);

        Person person = new Student();  //多态--用顶级的接口去声明，new的时候用具体的实现类去实例化。
        Person person1 = new Teacher();
       if(person instanceof Student){
           Student student1 = (Student)person;  //子类对象new Student()声明为 父类类型Person person---强制类型转换成子类对象Student
           student1.talk();
       }
       if(person1 instanceof Teacher){
           Teacher teacher = (Teacher)person1;
           teacher.talk();
       }

    }
}
