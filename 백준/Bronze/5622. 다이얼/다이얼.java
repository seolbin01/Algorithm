import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] phone = {"-1", "-1", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String str = br.readLine();

        int total = 0;
        for(char c : str.toCharArray()) {
            if(c >= 'S') c -= 1;
            int num = ((c - 'A') / 3) + 2;
            if(num == 10) num--;
            total += Arrays.asList(phone).indexOf(String.valueOf(num));
        }

        System.out.println(total);

        br.close();
    }

}