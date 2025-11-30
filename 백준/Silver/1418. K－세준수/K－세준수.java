import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int count = 1;

        for (int i=2;i<=N;i++) {
            int max = 0;
            int cur = i;
            for (int j=2;j<=Math.sqrt(cur);j++) {
                while (cur % j == 0) {
                    cur /= j;
                    max = j;
                }
            }
            max = Math.max(cur, max);

            if (max <= K) {
                count++;
            }
        }
        System.out.println(count);
    }
}
