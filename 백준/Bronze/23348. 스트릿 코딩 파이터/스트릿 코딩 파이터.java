import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            for(int i=0;i<N;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                StringTokenizer st3 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken()) + Integer.parseInt(st2.nextToken()) + Integer.parseInt(st3.nextToken());
                int b = Integer.parseInt(st1.nextToken()) + Integer.parseInt(st2.nextToken()) + Integer.parseInt(st3.nextToken());
                int c = Integer.parseInt(st1.nextToken()) + Integer.parseInt(st2.nextToken()) + Integer.parseInt(st3.nextToken());

                arr[i] = a*A + b*B + c*C;
            }

            Arrays.sort(arr);
            System.out.println(arr[arr.length - 1]);
        }
    }
}