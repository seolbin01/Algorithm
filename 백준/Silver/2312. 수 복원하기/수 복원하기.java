import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());
            for (int j=2;j<=Math.sqrt(N);j++) {
                int count = 0;
                while (N % j == 0) {
                    count++;
                    N /= j;
                }
                if (count != 0) {
                    sb.append(j).append(" ").append(count).append("\n");
                }
            }
            if (N != 1) {
                sb.append(N).append(" 1").append("\n");
            }
        }

        System.out.print(sb);
    }
}
