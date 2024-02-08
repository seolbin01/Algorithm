import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(br.readLine());
            arr[1] = Integer.parseInt(br.readLine());
            arr[2] = Integer.parseInt(br.readLine());
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}