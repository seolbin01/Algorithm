import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long N = Integer.parseInt(br.readLine());
            long total =0;
            for(long i=1;i<N;i++){
                total += N*i+i;
            }
            System.out.println(total);
        }
    }
}