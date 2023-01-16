import java.util.*;

public class SortedApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jia", "Jia6", "Jia3", "Jia2", "Jia7"));
        Collections.sort(list);
        for(var i : list){
            System.out.println(i);
        }
        Comparator<String> reverse = Comparator.reverseOrder();
        Collections.sort(list, reverse);
        for(var value : list){
            System.out.println(value);
        }
    }
}
