import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> absHeap = new PriorityQueue<>((a, b) -> {
                if (Math.abs(a) != Math.abs(b)) {
                    return Math.abs(a) - Math.abs(b);
                } else {
                    return a - b;
                }
            });

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(br.readLine());
                if (x != 0) {
                    absHeap.offer(x);
                } else {
                    if (!absHeap.isEmpty()) {
                        System.out.println(absHeap.poll());
                    } else {
                        System.out.println(0);
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}