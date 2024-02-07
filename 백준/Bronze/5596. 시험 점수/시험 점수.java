import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = 0;
            int b = 0;
            for(int i=0;i<4;i++){
                a += Integer.parseInt(st.nextToken());
            }

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int i=0;i<4;i++){
                b += Integer.parseInt(st1.nextToken());
            }

            if(a > b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
}