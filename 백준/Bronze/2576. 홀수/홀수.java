import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int min = 100;
            int sum = 0;
            int[] arr = new int[7];
            for(int n=0;n<7;n++){
                arr[n] = Integer.parseInt(br.readLine());
            }
            for(int i=0;i<7;i++){
                if((arr[i] % 2) == 0) {
                    continue;
                }
                if(min > arr[i]) min = arr[i];
                sum += arr[i];
            }
            if(sum != 0){
                System.out.println(sum);
                System.out.println(min);
            }
            else System.out.println("-1");
        }
    }
}