import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int num = 0;
            int bottle = 0;

            bottle = e+f;
            while(bottle >= c) {
                num += bottle / c;
                bottle = bottle/c + bottle%c;
            }

            System.out.println(num);
        }
    }
}