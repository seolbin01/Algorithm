import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        Arrays.fill(time, Integer.MAX_VALUE);
        time[N] = 0;

        bfs();

        System.out.println(time[K]);
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);

        while (!q.isEmpty()) {
            int current = q.poll();

            int[] next = {current - 1, current + 1, current * 2};

            for (int i=0;i<3;i++) {
                if (next[i] < 0 || next[i] > 100000) continue;

                if (time[next[i]] > time[current] + 1) {
                    time[next[i]] = time[current] + 1;
                    q.offer(next[i]);
                }
            }
        }
    }
}