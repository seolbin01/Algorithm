import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();

            while(N>0){
                if(N%B < 10){
                    sb.append((char)(N%B + '0'));
                }
                else {
                    sb.append((char)(N%B - 10 + 'A'));
                }
                N /= B;
            }

            sb.reverse();
            System.out.println(sb);
        }
    }
}