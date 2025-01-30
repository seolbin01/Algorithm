import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {

            int n = Integer.parseInt(input);

            if (n == 1) {
                System.out.println(1);
                break;
            }

            int mod = 11;
            int length = 2;

            while (mod % n != 0) {
                mod = ((mod * 10) + 1) % n;
                length++;
            }
            System.out.println(length);
        }
    }
}