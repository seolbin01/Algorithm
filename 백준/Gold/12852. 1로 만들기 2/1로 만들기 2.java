import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N;
    static int[] dp;
    static int[] prev;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        prev = new int[N+1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;

        for (int i=2;i<=N;i++) {
            dp[i] = dp[i-1] + 1;
            prev[i] = i-1;

            if (i%2 == 0 && dp[i] > dp[i/2] + 1) {
                dp[i] = dp[i/2] + 1;
                prev[i] = i/2;
            }

            if (i%3 == 0 && dp[i] > dp[i/3] + 1) {
                dp[i] = dp[i/3] + 1;
                prev[i] = i/3;
            }
        }

        System.out.println(dp[N]);

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            sb.append(N).append(" ");
            N = prev[N];
        }

        System.out.println(sb);
    }
}