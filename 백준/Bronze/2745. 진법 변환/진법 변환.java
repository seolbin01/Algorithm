import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str = br.readLine().split(" ");
            String N = str[0];
            int B = Integer.parseInt(str[1]);
            int total = 0;
            for (int i = 0; i < N.length(); i++) {
                char c = N.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    total += (c - 55) * (int) (Math.pow(B, N.length() - i - 1));
                }
                else {
                    total += Character.getNumericValue(c) * (int) (Math.pow(B, N.length() - i - 1));
                }
            }
            System.out.println(total);
        }
    }
}