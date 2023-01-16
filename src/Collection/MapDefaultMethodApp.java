package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("jia","jia1");
        map.put("Rahman","Jia2");
        map.put("AThaya","Jia3");
        map.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
