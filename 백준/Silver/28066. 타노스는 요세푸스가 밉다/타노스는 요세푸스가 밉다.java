import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=1;i<N+1;i++) {
            deque.addLast(i);
        }

        boolean chk = true;
        while (deque.size() != 1) {
            if (deque.size() >= K) {
                int first = deque.pollFirst();
                for (int i = 1; i < K; i++) {
                    deque.pollFirst();
                }
                deque.addLast(first);
            } else {
                chk = false;
                System.out.println(deque.pollFirst());
                break;
            }
        }

        if (chk) {
            System.out.println(deque.poll());
        }
    }
}
