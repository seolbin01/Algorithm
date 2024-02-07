import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                System.out.println("YONSEI");
            }
            else if(n == 1){
                System.out.println("Leading the Way to the Future");
            }
        }
    }
}