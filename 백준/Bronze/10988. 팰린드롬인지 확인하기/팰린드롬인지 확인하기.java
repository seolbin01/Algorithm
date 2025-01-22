import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        int length = arr.length;

        boolean chk = true;

        for (int i=0;i<length/2;i++) {
            if (arr[i] != arr[length - 1 - i]) {
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