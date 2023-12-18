import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arrB = new int[N];
            for(int i=0;i<N;i++){
                arrB[i] = Integer.parseInt(st.nextToken());
            }

            int sum = 0;
            int[] arrA = new int[N];
            for(int i=0;i<N;i++){
                arrA[i] = arrB[i] * (i+1) - sum;
                sum += arrA[i];
            }

            for(int k : arrA) System.out.print(k + " ");
        }
    }
}