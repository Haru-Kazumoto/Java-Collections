import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Rahman","Rahman");
        map.put("Mira","Mira");
        map.put("Jia","Jia");
        for(var i : map.keySet()){
            System.out.println(i);
        }
        System.out.println(map.lowerKey("Rahman"));
        System.out.println(map.higherKey("Mira"));
    }
}
