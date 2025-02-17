import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, K;
    static int[] time = new int[100001];
    static int[] parentIndex = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Arrays.fill(time, -1);
        Arrays.fill(parentIndex, -1);
        time[N] = 0;

        bfs();

        System.out.println(time[K]);

        Stack<Integer> path = new Stack<>();
        int currentIndex = K;

        while ( currentIndex != -1) {
            path.push(currentIndex);
            currentIndex = parentIndex[currentIndex];
        }

        StringBuilder sb = new StringBuilder();

        while (!path.isEmpty()) {
            sb.append(path.pop()).append(" ");
        }

        System.out.println(sb);
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);

        while (!q.isEmpty()) {
            int current = q.poll();

            int[] next = {current - 1, current + 1, current * 2};

            for (int i=0;i<3;i++) {
                if (next[i] < 0 || next[i] > 100000) continue;

                if (time[next[i]] == -1) {
                    time[next[i]] = time[current] + 1;
                    parentIndex[next[i]] = current;
                    q.offer(next[i]);
                }
            }
        }
    }
}