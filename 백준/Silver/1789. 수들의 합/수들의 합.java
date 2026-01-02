import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s = Long.parseLong(br.readLine());

        long cur = 1;
        long count = 0;

        while (s >= cur) {
            s -= cur;
            cur++;
            count++;
        }

        System.out.println(count);
    }
}
