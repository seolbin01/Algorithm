import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[][] candy;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = (int) Math.round(Float.parseFloat(st.nextToken()) * 100);


            if (n == 0 && m == 0) break;

            candy = new int[n][2];

            for (int i = 0; i < n; i++) {

                st = new StringTokenizer(br.readLine());

                candy[i][0] = Integer.parseInt(st.nextToken());
                candy[i][1] = (int) Math.round(Float.parseFloat(st.nextToken()) * 100);
            }

            dp = new int[m + 1];

            for (int i=0;i<n;i++) {
                int cal = candy[i][0];
                int price = candy[i][1];

                for (int j=price;j<=m;j++) {
                    dp[j] = Math.max(dp[j], dp[j-price] + cal);
                }
            }

            sb.append(dp[m]).append("\n");
        }

        System.out.println(sb);
    }
}