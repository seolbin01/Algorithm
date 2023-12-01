import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true){
                String str = br.readLine();
                int num = 0;

                if (str.equals("#")) break;

                for (int i=0;i<str.length();i++) {
                    switch (str.charAt(i)) {
                        case '-':
                            num += Math.pow(8, str.length()-i-1) * 0;
                            break;
                        case '\\':
                            num += Math.pow(8, str.length()-i-1) * 1;
                            break;
                        case '(':
                            num += Math.pow(8, str.length()-i-1) * 2;
                            break;
                        case '@':
                            num += Math.pow(8, str.length()-i-1) * 3;
                            break;
                        case '?':
                            num += Math.pow(8, str.length()-i-1) * 4;
                            break;
                        case '>':
                            num += Math.pow(8, str.length()-i-1) * 5;
                            break;
                        case '&':
                            num += Math.pow(8, str.length()-i-1) * 6;
                            break;
                        case '%':
                            num += Math.pow(8, str.length()-i-1) * 7;
                            break;
                        case '/':
                            num += Math.pow(8, str.length()-i-1) * (-1);
                            break;
                        default:
                            break;
                    }
                }
                System.out.println(num);
            }
        }
    }
}