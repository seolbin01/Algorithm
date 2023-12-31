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
            for(int i=0;i<N;i++){
                arr[i] = i+1;
            }

            for(int i=0;i<M;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken()) - 1;
                int b = Integer.parseInt(st1.nextToken()) - 1;

                while(a < b){
                    int temp = arr[a];
                    arr[a++] = arr[b];
                    arr[b--] = temp;
                }
            }

            for(int i : arr){
                System.out.print(i + " ");
            }
        }
    }
}