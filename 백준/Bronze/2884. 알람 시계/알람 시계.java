import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();
            int afterH, afterM;

            if(b < 45){
                if(a <= 0) {
                    afterH = 24 + (a - 1);
                }
                else{
                    afterH = a - 1;
                }
                afterM = 60 + (b-45);
                sb.append(afterH).append(" ").append(afterM);
            }
            else if(b >= 45){
                afterM = b - 45;
                sb.append(a).append(" ").append(afterM);
            }

            System.out.println(sb);
        }
    }
}