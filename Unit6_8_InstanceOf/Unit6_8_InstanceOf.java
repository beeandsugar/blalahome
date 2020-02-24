package Unit6_8_InstanceOf;

/**
 * 一、InstanceOf关键字和多态
 * 1. Java的运算符，保留关键字。
 *
 * 【作用】
 * 1.判断 类是否实现了某接口，或 实例对象是否属于一个类
 * e.g.
 * boolean result = object instanceOf class
 * //看object是不是class的一个实例 (若object = null，则false）
 *
 * 2.对[对象类型强制转换]前的判断
 *
 *二、【多态】
 * 同一个行为（方法），具有多个不同表现形式或形态。
 * 如支付---Pay(抽象)， ---AliPay（多态1）、WechatPay(多态2）、BaiduPay(多态3）
 * 1.继承方法重写
 * 2.同类方法的重载Overload
 * 3.抽象方法
 * 4.接口
 *
 *
 * @Override和@Overload
 * Override--不同类之间
 * Overload--同类之间，参数不同。方法名相同。
 *
 * 重写：
 * 1.返回值、形参不能改变
 * 2.父类的成员方法只能被它的子类重写
 * 3.final和static方法不能被重写
 * 4.构造方法不能被重写
 * 5.重写的时候，权限不能比父类更窄。
 *
 * 重载：
 * 1.构造函数可以重载。---方法名字相同，参数不同，返回类型可选。
 * 2.若方法名+参数都相同--调用的时候无法识别
 */
public class Unit6_8_InstanceOf {
}
