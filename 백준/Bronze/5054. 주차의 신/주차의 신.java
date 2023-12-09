import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++){
                int max = 0;
                int min = 99;
                int num = Integer.parseInt(br.readLine());

                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0;j<num;j++){
                    int store = Integer.parseInt(st.nextToken());
                    max = Math.max(max, store);
                    min = Math.min(min, store);
                }

                System.out.println((max - min) * 2);
            }
        }
    }
}