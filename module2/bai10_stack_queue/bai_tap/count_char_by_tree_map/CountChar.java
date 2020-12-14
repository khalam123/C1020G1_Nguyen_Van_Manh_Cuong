package bai10_stack_queue.bai_tap.count_char_by_tree_map;

import java.util.HashMap;
import java.util.Set;

public class CountChar {
    public static void main(String[] args) {
    String str = "Xin chào, tôi là học viên, tôi đến từ Code Gym, Code Gym đầy nắng và gió";
    str = str.replaceAll(",","");
    String[] arr = str.split(" ");
    String key;
    Integer value;
    HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
    // print result
    Set set = map.keySet();
        for (Object o : set) {
            key = (String) o;
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}
