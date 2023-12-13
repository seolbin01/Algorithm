import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            for(int i=0;i<T;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] arr = new int[5];
                for(int j=0;j<5;j++){
                    arr[j] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(arr);
                if(arr[arr.length-2] - arr[1] > 3) System.out.println("KIN");
                else System.out.println(arr[1] + arr[2] + arr[3]);
            }
        }
    }
}