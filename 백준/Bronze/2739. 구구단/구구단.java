import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<9;i++){
                System.out.print(N);
                System.out.print(" * ");
                System.out.print(i+1);
                System.out.print(" = ");
                System.out.println(N*(i+1));
            }
        }
    }
}