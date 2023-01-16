import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> immutable = Map.of("fist", "Haru");

        Map<String, String> m = Map.of(
                "Name.First","Haru",
                "Name.Second","Kazumoto"
        );
        /**
         * then if we add some element on the Map (m),
         * it will throws an exception UnsupportedOperationException.
         */
//       m.put("JIa","Jia"); -Error
    }
}