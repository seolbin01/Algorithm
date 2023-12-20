import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] arr = new int[3];
                for(int j=0;j<3;j++){
                    arr[j] = Integer.parseInt(st.nextToken());
                }

                Arrays.sort(arr);

                StringBuilder sb = new StringBuilder();

                sb.append("Scenario #");
                sb.append(i+1);
                sb.append(":\n");
                if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)) {
                    sb.append("yes\n");
                }
                else sb.append("no\n");

                System.out.println(sb);
            }
        }
    }
}