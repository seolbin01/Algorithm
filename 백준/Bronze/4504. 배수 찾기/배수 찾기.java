import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            while(true){
                int num = Integer.parseInt(br.readLine());

                if(num == 0) break;

                if(num % n == 0) System.out.printf("%d is a multiple of %d.\n",num,n);
                else System.out.printf("%d is NOT a multiple of %d.\n",num,n);
            }
        }
    }
}