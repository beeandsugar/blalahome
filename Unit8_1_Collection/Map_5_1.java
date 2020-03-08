package Unit8_1_Collection;

/**
 * Map的数据结构
 *      底层是一个数据结构，每一项又是一个链表，---数组和链表的结合体。
 *      Table是数组，数组的元素是 Entry = key-value键值对。持有一个指向下一个Entry元素的引用，table数组的每个Entry元素同时作为当前Entry链表的首节点。
 *      也指向该链表的下一个Entry元素。
 *      
 *      数组 --- Entry1 ---Entry2 ---Entry3 ---Entry4--- 
 *               Entry1 ---Entry2 ---Entry3 ---Entry4---
 *               Entry1
 *               Entry1
 *               Entry1
 *
 *  常见实现类
 *  1.HashMap -- 散列，随机（无序存储）
 *      ·是一个散列桶HashMap Bucket（数组和链表），存储内容是键值对（Key-value）映射
 *      ·基于hashing原理，使用put（key,value)存储对象到HashMap中，使用get(key)从HashMap中获取对象。
 *      ·put（key，value）---对key调用hashCode（）方法，计算并返回的hashCode是用于找到Map数组的bucket位置，存储Entry对象。
 *       ----非线程安全，HashMap操作速度很快。
 *
 *
 *  2.TreeMap -- 有序存储
 *      ·在数据存储过程中，自动排序，实现了SotredMap接口，有序集合
 *      ·TreeMap使用的存储结构---平衡二叉树（红黑树）
 *      ·排序规则---默认通过key的字典顺序（abcd升序），也可以自定义排序规则--实现Comparator接口。
 */
public class Map_5_1 {
}
