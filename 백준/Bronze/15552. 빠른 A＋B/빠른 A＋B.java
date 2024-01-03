import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while(T>0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                sb.append(sum).append("\n");
                T--;
            }
            System.out.println(sb);
        }
    }
}