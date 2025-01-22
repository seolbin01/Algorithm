import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int length = str.length();

        boolean chk = true;

        for (int i=0;i<length/2;i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                chk = false;
                break;
            }
        }

        if (chk) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}