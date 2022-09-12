package ProgrammersLecture;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapMain {
    public static void main(String[] args) {
//        Map<String, Integer> map = new Hashtable<>();
        /*Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 1);
        map.putIfAbsent("A", 10);
        map.putIfAbsent("E", 10);
        map.remove("B", 3);
        map.replace("A", 1, 2);*/

        Map<Mydata, Integer> map = new ConcurrentHashMap<>();
        map.put(new Mydata(1), 1);
        map.put(new Mydata(2), 2);
        map.replace(new Mydata(1), 1, 11);

        method1(map);
    }

    static void method1(Map<Mydata, Integer> map) {
        System.out.println(map.remove(new Mydata(2), 3));
        System.out.println(map);
        System.out.println(map.get(new Mydata(1)));
        System.out.println(map.getOrDefault(new Mydata(3), -1));
/*        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.getOrDefault("C", -1));
        System.out.println(map.keySet());
        System.out.println(map.values());*/
    }
}
