import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (Character.isLowerCase(c)) {
                int num = c - 'a' + 13;
                if (num >= 26) num -= 26;

                sb.append((char)('a' + num));
                continue;
            }

            if (Character.isUpperCase(c)) {
                int num = c - 'A' + 13;
                if (num >= 26) num -= 26;

                sb.append((char)('A' + num));
                continue;
            }

            sb.append(c);
        }

        System.out.println(sb);
    }
}