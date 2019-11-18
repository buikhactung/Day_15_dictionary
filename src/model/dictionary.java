package model;

import java.util.HashMap;
import java.util.Map;

public class dictionary {
    static Map<String, String> dic = new HashMap<>();

    static {
        dic.put("one", "mot");
        dic.put("two", "hai");
        dic.put("three", "ba");
        dic.put("four", "bon");
        dic.put("five", "nam");
        dic.put("six", "sau");
        dic.put("seven", "bay");
        dic.put("eight", "tam");
        dic.put("nine", "chin");
        dic.put("ten", "muoi");
    }
public String findById(String id) {
        return dic.get(id);
}


}


