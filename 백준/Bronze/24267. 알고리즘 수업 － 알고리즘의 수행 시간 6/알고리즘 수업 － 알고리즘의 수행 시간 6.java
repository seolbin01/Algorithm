import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine());
            System.out.println(n*(n-1)*(n-2)/6);
            System.out.println(3);
        }
    }
}