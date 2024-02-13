import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            switch (str){
                case "NLCS":
                    System.out.println("North London Collegiate School");
                    break;
                case "BHA":
                    System.out.println("Branksome Hall Asia");
                    break;
                case "KIS":
                    System.out.println("Korea International School");
                    break;
                case "SJA":
                    System.out.println("St. Johnsbury Academy");
                    break;
                default:
                    break;
            }
        }
    }
}