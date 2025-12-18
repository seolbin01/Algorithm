import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            String str = br.readLine();
            String[] command = str.split(" ");

            switch (command[0]) {
                case "1":
                    dq.addFirst(Integer.parseInt(command[1]));
                    break;
                case "2":
                    dq.addLast(Integer.parseInt(command[1]));
                    break;
                case "3":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollFirst()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "4":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollLast()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "5":
                    sb.append(dq.size()).append("\n");
                    break;
                case "6":
                    sb.append(dq.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekFirst()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "8":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekLast()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.print(sb);
    }
}
