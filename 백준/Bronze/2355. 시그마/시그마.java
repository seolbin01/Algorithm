import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long sum;
            if (A < B){
                sum = (B - A + 1) * (A + B) / 2;
            }
            else {
                sum =(A - B + 1) * (B + A) / 2;
            }
            System.out.println(sum);
        }
    }
}