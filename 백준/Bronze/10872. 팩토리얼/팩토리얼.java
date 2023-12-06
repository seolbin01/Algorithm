import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int total = 1;
            for(int i=0;i<N;i++){
                total *= (i+1);
            }
            System.out.println(total);
        }
    }
}