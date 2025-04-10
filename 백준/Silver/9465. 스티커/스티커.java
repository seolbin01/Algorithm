import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st1;
        StringTokenizer st2;

        for (int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[2][n];
            int[][] dp = new int[2][n];

            st1 = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());

            for (int j=0;j<n;j++) {
                map[0][j] = Integer.parseInt(st1.nextToken());
                map[1][j] = Integer.parseInt(st2.nextToken());
            }

            dp[0][0] = map[0][0];
            dp[1][0] = map[1][0];

            if (n > 1) {
                dp[0][1] = map[0][1] + dp[1][0];
                dp[1][1] = map[1][1] + dp[0][0];
            }

            for (int k=2;k<n;k++) {
                dp[0][k] = map[0][k] + Math.max(dp[1][k - 1], dp[1][k - 2]);
                dp[1][k] = map[1][k] + Math.max(dp[0][k - 1], dp[0][k - 2]);
            }

            System.out.println(Math.max(dp[0][n - 1], dp[1][n - 1]));
        }
    }
}