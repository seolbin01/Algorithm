import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            int cnt = 0;
            for(int i=0;i<str.length();i++){
                switch (str.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cnt++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(cnt);
        }
    }
}