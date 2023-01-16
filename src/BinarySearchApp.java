import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }
        int index = Collections.binarySearch(numbers,123);
        System.out.println(index);
        Comparator<Integer> comparator = Comparator.reverseOrder();
        int index2 = Collections.binarySearch(numbers,123);
        System.out.println(index);
    }
}
