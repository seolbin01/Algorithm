import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++){
                int d = Integer.parseInt(br.readLine());
                int t = 0;
                while(true){
                    if (t + Math.pow(t,2) > d) {
                        t--;
                        break;
                    }
                    t++;
                }
                System.out.println(t);
            }
        }
    }
}