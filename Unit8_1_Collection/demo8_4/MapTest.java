package Unit8_1_Collection.demo8_4;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

//        TreeMap<String,String> map = new TreeMap<>();

        //map.put(key,value)  //向容器里放key-value
        map.put("bob","重庆");
        map.put("amy","北京");
        System.out.println("初始化容器，放入两个对象结果："+map);

        //map.get(key)  ---根据key获取value
        System.out.println(map.get("bob"));

        //map.containsKey()  //查询是否包含Key
        System.out.println(map.containsKey("amy"));

        //map.size ---返回map的元素数量
        int size = map.size();
        System.out.println("map里面元素数量："+size);

        //map.clear();  --清空map容器

        //获取所有key的集合
       Set<String> set = map.keySet();
        //获取所有values的集合
        map.values();
    }
}
