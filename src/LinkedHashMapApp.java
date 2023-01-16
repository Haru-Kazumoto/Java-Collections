import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("First","Haru");
        map.put("Mid","Kazu");
        map.put("Last","moto");
        Set<String> keys = map.keySet();
        for(var i : keys){
            System.out.println(i);
        }
    }
}
