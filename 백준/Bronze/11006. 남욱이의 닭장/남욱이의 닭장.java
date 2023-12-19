import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            for(int i=0;i<T;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                int u = 2*M - N;
                int t = M - u;

                System.out.printf("%d %d\n",u,t);
            }
        }
    }
}