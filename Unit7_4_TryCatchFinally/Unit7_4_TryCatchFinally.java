package Unit7_4_TryCatchFinally;

/**
 * 多重捕获
 *
 *  1.格式1-- try-catch-finally
 *  try{
 *     //
 * }catch( ){
 *     //抛给第一个代码块，如果不匹配，再向下
 * }catch( ){
 *
 * }finally( ){
 *    //创建在try之后，执行的代码块。
 *    //一定会被执行---一般用于【资源回收/释放】等操作
 * }
 *
 * 2.格式-- try--finally
 *
 * 【注意】
 * finally是先执行的（字节码顺序）>> try{}
 * 即使是 不抛异常的情况
 * 如果在finally返回了内容--优先于try里面的return内容
 *
 */
public class Unit7_4_TryCatchFinally {
}
