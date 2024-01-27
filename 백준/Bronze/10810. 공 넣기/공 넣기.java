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

            for(int a=0;a<M;a++){
                StringTokenizer stA = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(stA.nextToken());
                int j = Integer.parseInt(stA.nextToken());
                int k = Integer.parseInt(stA.nextToken());

                for(int b=i-1;b<j;b++){
                    arr[b] = k;
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int x=0;x<N;x++){
                sb.append(arr[x]).append(" ");
            }

            System.out.println(sb);
        }
    }
}