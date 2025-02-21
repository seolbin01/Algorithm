import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] W;
    static int[][] dp;
    static final int INF = 16_000_000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        W = new int[N][N];
        dp = new int[N][(1 << N)-1];

        // 비용 행렬 입력
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.fill(dp[i], -1);  // dp 배열 초기화
        }

        // 0번 도시에서 시작
        System.out.println(tsp(0, 1));
    }

    // current: 현재 도시, visited: 방문한 도시들의 비트마스크
    static int tsp(int current, int visited) {
        // 모든 도시를 방문했을 때
        if(visited == (1 << N) - 1) {
            if(W[current][0] == 0) return INF;  // 시작점으로 돌아가는 경로가 없는 경우
            return W[current][0];  // 시작 도시로 돌아가는 비용
        }

        // 이미 계산된 경우
        if(dp[current][visited] != -1) {
            return dp[current][visited];
        }

        dp[current][visited] = INF;

        // 다음 방문할 도시 선택
        for(int next = 0; next < N; next++) {
            // 아직 방문하지 않은 도시이고, 갈 수 있는 경우
            if((visited & (1 << next)) == 0 && W[current][next] != 0) {
                dp[current][visited] = Math.min(dp[current][visited],
                        W[current][next] + tsp(next, visited | (1 << next)));
            }
        }

        return dp[current][visited];
    }
}