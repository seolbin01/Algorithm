import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[31];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        dp();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            sb.append(dp[N]).append("\n");
        }
        System.out.print(sb);
    }

    private static void dp() {   // 카탈란 수
        dp[0] = 1;

        for (int i = 1; i <= 30; i++) {
            dp[i] = dp[i - 1] * (2 * (2 * i - 1)) / (i + 1);
        }
    }
}