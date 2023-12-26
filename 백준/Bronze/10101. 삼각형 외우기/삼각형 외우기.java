import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            if(a == 60 && b == 60 && c == 60) System.out.println("Equilateral");
            else if(a+b+c == 180){
                if(a == b || b == c || a == c) System.out.println("Isosceles");
                else System.out.println("Scalene");
            }
            else System.out.println("Error");
        }
    }
}