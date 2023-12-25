import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] input = br.readLine().split(" ");
            arr[0] = Integer.parseInt(input[0]);
            int left = arr[0];
            int right = arr[0];
            int max = 0;

            for(int i = 1; i < N; i++) {
                arr[i] = Integer.parseInt(input[i]);
                if(arr[i - 1] < arr[i]) {
                    right = arr[i];
                } else {
                    max = Math.max(max, right - left);
                    right = arr[i];
                    left = arr[i];
                }
            }
            max = Math.max(max, right - left);
            System.out.println(max);
        }
    }
}