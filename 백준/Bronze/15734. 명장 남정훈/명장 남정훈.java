import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int num = 0;
            int diff = Math.max(L, R) - Math.min(L, R);
            if(L != R) {
                num += Math.min(L, R) * 2;
                if(Math.min(diff, A) == A){
                    num += A * 2;
                }
                else {
                    num += diff * 2;
                    num += ((A - diff)/2) * 2;
                }
            }
            else {
                num += L*2 + (A/2)*2;
            }
            System.out.println(num);
        }
    }
}