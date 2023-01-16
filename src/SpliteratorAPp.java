import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorAPp {
    public static void main(String[] args) {
        List<String> list = List.of("Jia1","Jia2","Jia3","Jia4","Jia5","Jia6");
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator1.forEachRemaining(System.out::println);
        spliterator2.forEachRemaining(System.out::println);
    }
}
