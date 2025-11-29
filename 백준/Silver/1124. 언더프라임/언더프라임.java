import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int underPrime = 0;
        for (int i=A;i<=B;i++) {
            int cur = i;
            int count = 0;
            for (int j=2;j<=Math.sqrt(cur);j++) {
                while (cur % j == 0) {
                    count++;
                    cur /= j;
                }
            }
            if (cur != 1) {
                count++;
            }

            if (count == 1) {
                continue;
            }

            boolean chk = true;
            for (int j=2;j<=Math.sqrt(count);j++) {
                if (count % j == 0) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                underPrime++;
            }
        }

        System.out.println(underPrime);
    }
}
