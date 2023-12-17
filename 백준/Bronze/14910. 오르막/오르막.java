import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            String str = "Good";
            while(st.hasMoreTokens()){
                int B = Integer.parseInt(st.nextToken());
                if(A > B) {
                    str = "Bad";
                    break;
                }
                A = B;
            }
            System.out.println(str);
        }
    }
}