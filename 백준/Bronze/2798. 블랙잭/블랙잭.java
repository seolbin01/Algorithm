import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st1.nextToken());
            }
            Arrays.sort(arr);

            int sum = 0;
            int result = 0;
            for(int i=0;i<N-2;i++){
                for(int j=i+1;j<N-1;j++){
                    for(int k=j+1;k<N;k++){
                        sum = arr[i] + arr[j] + arr[k];
                        if(sum == M) {
                            result = sum;
                            break;
                        }
                        if(result < sum && sum <= M) result = sum;
                        else if(sum > M) break;
                    }
                }
            }

            System.out.println(result);
        }
    }
}