import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key1","Value1");
        map.put("Key2","Value2");
        map.put("Key3","Value3");
        Set<Map.Entry<String, String>> entryclass = map.entrySet();
        for (var i : entryclass){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
    }
}
