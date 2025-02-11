import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] scv = new int[3];
    static int[][] damage = {
            {9, 3, 1},
            {9, 1, 3},
            {3, 9, 1},
            {3, 1, 9},
            {1, 9, 3},
            {1, 3, 9}
    };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0;i<N;i++) {
            scv[i] = Integer.parseInt(st.nextToken());
        }

        int result = bfs(scv);

        System.out.println(result);
    }

    private static int bfs(int[] scv) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{scv[0], scv[1], scv[2], 0});
        boolean[][][] visited = new boolean[61][61][61];  // 체력 범위가 0~60이므로 61로 초기화
        visited[scv[0]][scv[1]][scv[2]] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int hp1 = current[0];
            int hp2 = current[1];
            int hp3 = current[2];
            int count = current[3];

            if (hp1 == 0 && hp2 == 0 && hp3 == 0) {  // 모든 scv 파괴한 경우
                return count;  // 공격 횟수 반환
            }

            for (int i=0;i<6;i++) {
                int nextHp1 = Math.max(0, hp1 - damage[i][0]);
                int nextHp2 = Math.max(0, hp2 - damage[i][1]);
                int nextHp3 = Math.max(0, hp3 - damage[i][2]);

                if (!visited[nextHp1][nextHp2][nextHp3]) {
                    visited[nextHp1][nextHp2][nextHp3] = true;
                    q.offer(new int[]{nextHp1, nextHp2, nextHp3, count + 1});
                }
            }
        }

        return -1;
    }
}