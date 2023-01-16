import java.util.IdentityHashMap;
import java.util.Map;

public class IdentitiHashMapApp {
    public static void main(String[] args) {
        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String key2 = name+"."+first;
        Map<String, String> map = new IdentityHashMap<>();
        map.put(key1, "Haru kazumoto");
        map.put(key2, "Haru kazumoto");
        System.out.println(map.size());

    }
}
