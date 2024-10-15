import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st;
        int num;
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    deque.offer(num);
                    break;
                case "pop":
                    System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(deque.isEmpty() ? -1 : deque.getFirst());
                    break;
                case "back":
                    System.out.println(deque.isEmpty() ? -1 : deque.getLast());
                    break;
            }
        }

    }
}