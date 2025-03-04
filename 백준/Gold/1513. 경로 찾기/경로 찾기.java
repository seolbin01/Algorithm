import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int MOD = 1000007;
    static int N, M, C;
    static int[][] map;
    static int[][][][] dp;   // [x][y][방문한 오락실 개수][마지막으로 방문한 오락실 번호]

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[N + 1][M + 1];
        dp = new int[N + 1][M + 1][C + 1][C + 1];

        for (int i=1;i<=C;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = i;   // 오락실 번호를 저장
        }

        // 초기값 설정 : 시작점(1,1)
        if (map[1][1] == 0) {
            dp[1][1][0][0] = 1;
        } else {
            int firstArcade = map[1][1];
            dp[1][1][1][firstArcade] = 1; // 첫 번째 오락실 방문 처리
        }

        // DP 테이블 채우기
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= M; y++) {
                for (int v = 0; v <= C; v++) {
                    for (int last = 0; last <= C; last++) {
                        if (dp[x][y][v][last] == 0) continue; // 이전에 온 경로가 없으면 스킵

                        // 아래로 이동할 경우
                        if (x + 1 <= N) {
                            int nextArcade = map[x + 1][y]; // 이동 후의 위치에서 오락실 확인
                            if (nextArcade == 0) { // 오락실이 아니라면, 그대로 이동
                                dp[x + 1][y][v][last] = (dp[x + 1][y][v][last] + dp[x][y][v][last]) % MOD;
                            } else if (nextArcade > last) { // 오락실 방문이 가능할 때
                                dp[x + 1][y][v + 1][nextArcade] = (dp[x + 1][y][v + 1][nextArcade] + dp[x][y][v][last]) % MOD;
                            }
                        }

                        // 오른쪽으로 이동할 경우
                        if (y + 1 <= M) {
                            int nextArcade = map[x][y + 1]; // 이동 후의 위치에서 오락실 확인
                            if (nextArcade == 0) {
                                dp[x][y + 1][v][last] = (dp[x][y + 1][v][last] + dp[x][y][v][last]) % MOD;
                            } else if (nextArcade > last) {
                                dp[x][y + 1][v + 1][nextArcade] = (dp[x][y + 1][v + 1][nextArcade] + dp[x][y][v][last]) % MOD;
                            }
                        }
                    }
                }
            }
        }

        // 정답 출력
        int[] result = new int[C + 1];
        for (int v = 0; v <= C; v++) {
            for (int last = 0; last <= C; last++) {
                result[v] = (result[v] + dp[N][M][v][last]) % MOD;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= C; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}