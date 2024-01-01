import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            boolean chk = true;

            while(N>0){
                if(N%5 == 0){
                    cnt += N/5;
                    break;
                }
                if(N<3){
                    chk = false;
                    break;
                }
                N -= 3;
                cnt++;
            }
            if(chk) System.out.println(cnt);
            else System.out.println("-1");
        }
    }
}