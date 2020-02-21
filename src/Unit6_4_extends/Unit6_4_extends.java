package Unit6_4_extends;

/**
 * 继承---extends
 * 子类继承父类--方法和属性
 * 继承的是【非private】的属性和方法-->父类能被继承的要用protected
 *
 *
 * 优点：
 * java中允许继承--减少重复代码
 */

/**
 * java--单继承
 * 如 Cat 可以继承Animal---但不能继承Plants
 * 但是可以多层继承 -- Cat extends Animal extends Living
 *
 * 所有的类都是继承于
 * java.lang.Object
 */

/**
 * final关键字
 * final 类---不能被继承
 * final 方法---方法不允许重写
 */

/**
 * 重写
 *     @Override
 * 父类中已经有的sleep()方法
 * 但是子类不想这样说---可以重写--名字相同、参数相同、方法体不同
 */

/**
 * 已经重写了sleep(){} --默认调用子类里面的方法
 * 如果想调用父类里面的sleep()方法--- 用super指向父类。
 *
 */
public class Unit6_4_extends {
}


