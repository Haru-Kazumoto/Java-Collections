import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethodApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6"));
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
    }
}
