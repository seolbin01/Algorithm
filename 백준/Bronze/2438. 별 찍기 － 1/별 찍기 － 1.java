import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int i = 1;
            int N = Integer.parseInt(br.readLine());
            while(i<N+1){
                System.out.println("*".repeat(i));
                i++;
            }
        }
    }
}