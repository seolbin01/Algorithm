import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            int n = 666;

            while (true) {
                String str = Integer.toString(n);
                if (str.contains("666")) {
                    cnt++;
                }

                if (cnt == N) {
                    break;
                }

                n++;
            }
            System.out.println(n);
        }
    }
}