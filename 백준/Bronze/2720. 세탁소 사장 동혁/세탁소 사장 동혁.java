import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<T;i++){
                int N = Integer.parseInt(br.readLine());
                sb.append(N/25).append(" ");
                N %= 25;
                sb.append(N/10).append(" ");
                N %= 10;
                sb.append(N/5).append(" ");
                N %= 5;
                sb.append(N).append("\n");
            }
            System.out.println(sb);
        }
    }
}