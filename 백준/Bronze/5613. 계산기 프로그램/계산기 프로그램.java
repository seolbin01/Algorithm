import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int result = Integer.parseInt(br.readLine());

            loop:
            while (true){
                String B = br.readLine();
                int A = 0;
                switch (B){
                    case "+":
                        A = Integer.parseInt(br.readLine());
                        result += A;
                        break;
                    case "-":
                        A = Integer.parseInt(br.readLine());
                        result -= A;
                        break;
                    case "*":
                        A = Integer.parseInt(br.readLine());
                        result *= A;
                        break;
                    case "/":
                        A = Integer.parseInt(br.readLine());
                        result /= A;
                        break;
                    case "=":
                        break loop;
                    default:
                        break;
                }
            }
            System.out.println(result);
        }
    }
}