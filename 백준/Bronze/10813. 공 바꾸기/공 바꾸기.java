import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            for(int a=0;a<N;a++){
                arr[a] = a+1;
            }

            for(int b=0;b<M;b++){
                StringTokenizer stA = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(stA.nextToken());
                int j = Integer.parseInt(stA.nextToken());
                int tmp;

                tmp = arr[i-1];
                arr[i-1] = arr[j-1];
                arr[j-1] = tmp;
            }

            StringBuilder sb = new StringBuilder();
            for(int a=0;a<N;a++){
                sb.append(arr[a]).append(" ");
            }

            System.out.println(sb);
        }
    }
}