import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int[] coin;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        coin = new int[n];
        dp = new int[k + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i=0;i<n;i++) {
            int c = Integer.parseInt(br.readLine());
            coin[i] = c;
        }

        dp();

        if (dp[k] != Integer.MAX_VALUE) {
            System.out.println(dp[k]);
        } else {
            System.out.println(-1);
        }
    }

    private static void dp() {

        for (int c : coin) {
            for (int i=c;i<=k;i++) {
                if (dp[i-c] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
    }
}