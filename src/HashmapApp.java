import java.util.HashMap;
import java.util.Map;

public class HashmapApp {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("Name.First","Zia");
        data.put("Name.Mid","Urrahman");
        data.put("Name.Last","Athaya");
        System.out.println(data.get("Name.First"));
        System.out.println(data.get("Name.Mid"));
        System.out.println(data.get("Name.Last"));
    }
}
