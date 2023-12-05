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
            StringTokenizer stN = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(stN.nextToken());
                if(arr[i] < X) System.out.print(arr[i] + " ");
            }
        }
    }
}