import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int cnt = 0;

            for(int i=0;i<N;i++){
                if(N % (i+1) == 0){
                    arr[cnt] = i+1;
                    cnt++;
                }
            }

            if(arr[K-1] != 0) {
                System.out.println(arr[K - 1]);
            }
            else System.out.println(0);
        }
    }
}