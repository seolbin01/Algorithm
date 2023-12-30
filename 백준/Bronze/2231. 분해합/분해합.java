import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str_N = br.readLine();
            int N = Integer.parseInt(str_N);
            int result = 0;

            for(int i=N-(str_N.length()*9);i<N;i++){
                int num = i;
                int sum = 0;

                while (num != 0){
                    sum += num % 10;
                    num /= 10;
                }

                if(sum+i == N){
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        }
    }
}