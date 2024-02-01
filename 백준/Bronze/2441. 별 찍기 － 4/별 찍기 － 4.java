import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for(int i=N;i>0;i--){
                int a = N-i;
                sb.append(" ".repeat(a));
                sb.append("*".repeat(i));
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}