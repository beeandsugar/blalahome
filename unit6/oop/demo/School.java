package unit6.oop.demo;

/**
 * 类--模板 ---里面定义一类对象的方法和属性
 */
public class School {

    /**
     * 学校这个类 拥有的属性 --name, address
     */
    private String name;

    private String address;

    private int age;

    private Teacher[] teachers;

    /**
     * 普通方法、 类方法
     * 类方法：加static的方法
     *
     *
     */
    class addTeacher {

    }

    public void setAge(int age){
        //保证合法性 一般通过方法进行设置
        //通过方法进行拦截--判断
        if(age>0){
            this.age = age;
        }
        else {
            System.out.println("不合法");
        }
    }

    /**
     * 设置teachers
     * @param teachers
     */
    public void  setTeachers(Teacher[] teachers){
        this.teachers = teachers;
    }

    /**
     * 获取teachers
     * @return
     */
    public Teacher[] getTeachers(){
        return teachers;
    }
}










