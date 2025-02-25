import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int T, W;
    static int[] tree;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        tree = new int[T + 1];

        for (int i=1;i<=T;i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[T + 1][W + 1];

        dp();

        // 최댓값 찾기
        int maxPlums = 0;
        for (int w = 0; w <= W; w++) {
            maxPlums = Math.max(maxPlums, dp[T][w]);
        }

        System.out.println(maxPlums);
    }

    private static void dp() {

        for (int t = 1; t <= T; t++) {
            for (int w = 0; w <= W; w++) {
                // 현재 자두가 떨어지는 위치와 비교
                int currentTree = (w % 2 == 0) ? 1 : 2; // w가 짝수이면 1번 나무, 홀수이면 2번 나무

                // 현재 위치에서 받을 수 있는 자두 개수
                int catchPlum = (tree[t] == currentTree) ? 1 : 0;

                // 이동하지 않는 경우 : dp[t - 1][w] + catchPlum
                dp[t][w] = dp[t - 1][w] + catchPlum;

                // 이동하는 경우 : dp[t - 1][w - 1] + catchPlum
                // 둘 중 최댓값 선택
                if (w > 0) {
                    dp[t][w] = Math.max(dp[t][w], dp[t - 1][w - 1] + catchPlum);
                }
            }
        }

    }
}