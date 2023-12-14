import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            for(int i=0;i<T;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int D = Integer.parseInt(st.nextToken());

                int cnt = 0;

                for(int j=0;j<N;j++){
                    StringTokenizer st2 = new StringTokenizer(br.readLine());
                    double V = Double.parseDouble(st2.nextToken());
                    double F = Double.parseDouble(st2.nextToken());
                    double C = Double.parseDouble(st2.nextToken());

                    if((F/C)* V >= D) cnt++;
                }

                System.out.println(cnt);
            }
        }
    }
}