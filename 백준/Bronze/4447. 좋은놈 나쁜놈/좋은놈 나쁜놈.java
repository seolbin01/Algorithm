import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                String str = br.readLine();
                int g = 0;
                int b = 0;
                String str1 = str.toLowerCase().replaceAll("g","");
                String str2 = str.toLowerCase().replaceAll("b","");

                g = str.length() - str1.length();
                b = str.length() - str2.length();

                if(g > b) System.out.println(str + " is GOOD");
                else if(g < b) System.out.println(str + " is A BADDY");
                else System.out.println(str + " is NEUTRAL");
            }
        }
    }
}