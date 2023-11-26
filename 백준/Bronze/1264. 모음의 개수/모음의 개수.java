import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while(true){
                String str = br.readLine().toLowerCase();
                int num = 0;

                if (str.equals("#")) break;

                for (int i=0;i<str.length();i++) {
                    switch (str.charAt(i)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            num++;
                        default:
                            break;
                    }
                }
                System.out.println(num);
            }
        }
    }
}