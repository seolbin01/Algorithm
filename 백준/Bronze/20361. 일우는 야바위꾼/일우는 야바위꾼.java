import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                if(i+1 == X) arr[i] = 1;
                else arr[i] = 0;
            }

            for(int i=0;i<K;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                int temp = 0;
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
            }

            for(int i=0;i<N;i++){
                if(arr[i] == 1) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}