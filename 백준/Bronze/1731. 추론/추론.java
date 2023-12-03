import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());
            int Q = 0;
            int last = C;
            int cnt = 4;
            boolean chk;

            if((B-A) == (C-B)) {
                Q = B-A;
                chk = true;
            } else {
                Q = B/A;
                chk = false;
            }

            while(cnt <= N){
                last = Integer.parseInt(br.readLine());
                cnt++;
            }

            if(chk) last += Q;
            else last *= Q;

            System.out.println(last);
        }
    }
}