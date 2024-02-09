import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            for(int i=0;i<3;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<3;i++){
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb);
        }
    }
}