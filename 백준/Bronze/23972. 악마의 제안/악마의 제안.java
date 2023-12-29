import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long K = Long.parseLong(st.nextToken());
            long N = Long.parseLong(st.nextToken());
            long ori = 0;

            if(N == 1) {
                System.out.println("-1");
            }
            else {
                ori = (K*N) / (N-1);
                if((K*N) % (N-1) != 0) ori++;
                System.out.println(ori);
            }
        }
    }
}