import Collection.SingleQueue;
import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<String>();
        System.out.println(queue.offer("Jia"));
        System.out.println(queue.offer("Rahman"));
        System.out.println(queue.offer("Athaya"));
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
