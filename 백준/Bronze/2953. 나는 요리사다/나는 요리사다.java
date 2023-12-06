import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = new int[5];
            int max = 0;

            for(int i=0;i<5;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0;j<4;j++){
                    arr[i] += Integer.parseInt(st.nextToken());
                }
                max = Math.max(max, arr[i]);
            }
            StringBuilder sb = new StringBuilder();
            int num = 0;

            for(int i=0;i<5;i++){
                if(arr[i] == max) num = i + 1;
            }

            sb.append(num + " " + max);

            System.out.println(sb);
        }
    }
}