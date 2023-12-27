import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double d1 = Double.parseDouble(st.nextToken());
            double d2 = Double.parseDouble(st.nextToken());
            double d3 = Double.parseDouble(st.nextToken());

            double total = d1+d2+d3;

            double a = (total/2 - d3);
            double b = (total/2 - d2);
            double c = (total/2 - d1);

            if(a > 0 && b > 0 && c > 0) {
                System.out.println("1");
                System.out.printf("%.1f %.1f %.1f",a,b,c);
            }
            else System.out.print("-1");
        }
    }
}