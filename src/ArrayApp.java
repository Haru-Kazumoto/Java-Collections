import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Jia1","Jia2","Jia3","Jia4","Jia5","Jia6");
        Object[] obj = names.toArray();
        String[] strings = names.toArray(new String[]{});
        System.out.println(Arrays.toString(obj));
        System.out.println(Arrays.toString(strings));
    }
}
