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
            int c = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int cHour, cMin;

            cHour = c / 60;
            cMin = c % 60;

            a += cHour;
            b += cMin;

            if(b >= 60){
                a += 1;
                b -= 60;
            }

            if(a >= 24){
                a -= 24;
            }

            sb.append(a).append(" ").append(b);
            System.out.println(sb);
        }
    }
}