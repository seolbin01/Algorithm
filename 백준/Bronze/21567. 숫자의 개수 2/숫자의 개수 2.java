import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long A = Long.parseLong(br.readLine());
            long B = Long.parseLong(br.readLine());
            long C = Long.parseLong(br.readLine());
            String result = String.valueOf(A * B * C);
            for(int i=0;i<10;i++){
                int num = 0;
                for(int j=0;j<result.length();j++){
                    if(result.charAt(j)-'0' == i) num++;
                }
                System.out.println(num);
            }
        }
    }
}