import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(":fan::fan::fan:");
            System.out.println(":fan::"+str+"::fan:");
            System.out.println(":fan::fan::fan:");
        }
    }
}