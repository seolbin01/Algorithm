import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int T = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int cnt = 0;
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st2.nextToken());
                T -= arr[i];
                if(T >= 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}