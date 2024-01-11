import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
            StringBuilder sb = new StringBuilder();

            int c = Integer.parseInt(a) * Character.getNumericValue(b.charAt(2));
            int d = Integer.parseInt(a) * Character.getNumericValue(b.charAt(1));
            int e = Integer.parseInt(a) * Character.getNumericValue(b.charAt(0));

            sb.append(c).append("\n");
            sb.append(d).append("\n");
            sb.append(e).append("\n");
            sb.append(c+d*10+e*100).append("\n");

            System.out.println(sb);
        }
    }
}