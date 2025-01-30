import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long result = fpow(a, b, c);

        System.out.println(result);

    }

    static long fpow(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        } else {
            long temp = fpow(a, b/2, c) % c;

            if (b % 2 == 0) {
                return (temp * temp) % c;
            } else {
                return ((temp * temp) % c * a) % c;
            }
        }
    }
}