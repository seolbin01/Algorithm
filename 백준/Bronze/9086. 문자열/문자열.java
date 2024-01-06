import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                String str = br.readLine();
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
                System.out.println(sb);
            }
        }
    }
}