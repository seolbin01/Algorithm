import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if(x > 0){
                if(y > 0){
                    System.out.println("1");
                }
                else if(y < 0){
                    System.out.println("4");
                }
            }
            else if(x < 0){
                if(y > 0){
                    System.out.println("2");
                }
                else if(y < 0){
                    System.out.println("3");
                }
            }
        }
    }
}