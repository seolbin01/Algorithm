import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] dp = new boolean[N+1];

        dp[0] = false;
        if (N >= 1) dp[1] = true;  // cy
        if (N >= 2) dp[2] = false; // sk
        if (N >= 3) dp[3] = true;  // cy
        if (N >= 4) dp[4] = false; // sk

        for (int i=5;i<=N;i++) {
            dp[i] = true;
            if (dp[i-1] || dp[i-3] || dp[i-4]) {
                dp[i] = false;  // sk
            }
        }

        System.out.println(dp[N] ? "CY" : "SK");
    }
}
