import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int P = Integer.parseInt(br.readLine());
            for(int i=0;i<P;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                double D = Double.parseDouble(st.nextToken());
                double A = Double.parseDouble(st.nextToken());
                double B = Double.parseDouble(st.nextToken());
                double F = Double.parseDouble(st.nextToken());

                System.out.printf("%d %.6f\n",N,(D/(A+B)*F));
            }
        }
    }
}