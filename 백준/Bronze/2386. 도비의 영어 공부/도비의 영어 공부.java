import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                String str = br.readLine().replaceAll(" ", "");
                if (str.equals("#")) break;
                String str1 = str.toLowerCase().replaceAll(String.valueOf(str.charAt(0)), "");
                int num = str.length() - str1.length() - 1;
                System.out.printf("%c %d\n",str.charAt(0),num);
            }
        }
    }
}