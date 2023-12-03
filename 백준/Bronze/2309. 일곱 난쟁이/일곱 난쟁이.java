import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = new int[9];
            int sum = 0;
            int a = 0;
            int b = 0;
            for(int i=0;i<9;i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];
            }

            loop:
            for(a=0;a<8;a++){
                for(b=a+1;b<9;b++){
                    if((arr[a]+arr[b]) == sum - 100) {
                        break loop;
                    }
                }
            }

            arr[a] = 0;
            arr[b] = 0;
            Arrays.sort(arr);

            for(int i=2;i<9;i++) {
                System.out.println(arr[i]);
            }
        }
    }
}