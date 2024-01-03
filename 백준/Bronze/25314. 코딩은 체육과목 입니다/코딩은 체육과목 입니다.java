import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            n /= 4;
            while(n>0){
                System.out.print("long ");
                n--;
            }
            System.out.print("int");
        }
    }
}