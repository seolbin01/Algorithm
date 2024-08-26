import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.addLast(num);
                    break;
                case "pop":
                    if(!q.isEmpty()) sb.append(q.pollFirst());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(q.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                    break;
                case "front":
                    if(!q.isEmpty()) sb.append(q.getFirst());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "back":
                    if(!q.isEmpty()) sb.append(q.getLast());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);


    }
}