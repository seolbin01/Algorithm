import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int max =0;
            int num = 0;
            int[] arr = new int[9];
            for(int n=0;n<9;n++){
                arr[n] = Integer.parseInt(br.readLine());
            }
            for(int i=0;i<9;i++){
                if(max < arr[i]) {
                    max = arr[i];
                    num = i+1;
                }
            }
            System.out.println(max);
            System.out.println(num);
        }
    }
}