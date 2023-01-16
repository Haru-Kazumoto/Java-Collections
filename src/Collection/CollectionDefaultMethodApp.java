package Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 100 ; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.replaceAll(integer -> integer * 10);
        System.out.println(numbers);
        /**
         * pengganti for each biasa.
         * bisa diubah menjadi lambda function. :)
         */
        numbers.forEach(System.out::println);
        numbers.removeIf(integer -> integer > 500);
        System.out.println(numbers);
    }
}
