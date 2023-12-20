import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                String str = br.readLine();
                StringBuilder sb = new StringBuilder();
                sb.append(i+1);
                sb.append(". ");
                sb.append(str);
                System.out.println(sb);
            }
        }
    }
}