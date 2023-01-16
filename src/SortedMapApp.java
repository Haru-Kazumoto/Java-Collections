import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.reverseOrder();
        SortedMap<String, String> map = new TreeMap<>(comparator);
        map.put("Sofi","1");
        map.put("Sahwatul","2");
        map.put("Amirah","3");
        for(var j : map.keySet()){
            System.out.println(j);
        }
    }
}
