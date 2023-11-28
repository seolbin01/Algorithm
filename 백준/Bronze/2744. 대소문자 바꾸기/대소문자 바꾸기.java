import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            StringBuilder result = new StringBuilder();
            for (int i=0;i<str.length();i++) {
                if (str.charAt(i) < 'a') {
                    result.append((char)(str.charAt(i) + ('a'-'A')));
                }
                else {
                    result.append((char)(str.charAt(i) - ('a'-'A')));
                }
            }
            System.out.println(result.toString());
        }
    }
}