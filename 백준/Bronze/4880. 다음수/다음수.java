import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());

                if(A == 0 && B == 0 && C == 0) break;

                if((B-A) == (C-B)) System.out.printf("AP %d\n",C+(C-B));
                else System.out.printf("GP %d\n",C*(C/B));
            }
        }
    }
}