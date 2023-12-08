import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int A = 0;
            int B = 0;

            String str = br.readLine().replaceAll("A", "");
            String str1 = str.replaceAll("A", "");

            A = N-str1.length();
            B = str1.length();

            if(A > B) {
                System.out.println("A");
            }
            else if(A < B){
                System.out.println("B");
            }
            else System.out.println("Tie");
        }
    }
}