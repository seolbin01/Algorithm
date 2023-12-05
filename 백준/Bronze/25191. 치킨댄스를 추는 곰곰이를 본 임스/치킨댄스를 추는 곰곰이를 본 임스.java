import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int coke = Integer.parseInt(st.nextToken());
            int beer = Integer.parseInt(st.nextToken());
            int chi = 0;
            chi = (coke/2) + beer;
            chi = Math.min(chi, N);
            System.out.println(chi);
        }
    }
}