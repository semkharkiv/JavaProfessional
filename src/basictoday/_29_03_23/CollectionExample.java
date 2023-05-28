package basictoday._29_03_23;


import java.util.Map;
import java.util.TreeMap;



public class CollectionExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();  //Tree отсортированный массив
        map.put("Mikhail", 5200);
        map.put("Olga", 4900);
        map.put("Nikolay", 4800);
        map.put("Vilatii", 2500);
        map.put("Sem", 4200);
        map.put("Sergei", 4500);
        System.out.println(map);

    }
}
