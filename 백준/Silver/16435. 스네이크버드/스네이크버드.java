import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken());
            int L = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st2.nextToken());
            }

            boolean chk = true;
            while(chk) {
                Arrays.sort(arr);
                chk = false;
                for (int k=0;k<arr.length;k++) {
                    if (arr[k] <= L && arr[k] != 0) {
                        L++;
                        arr[k] = 0;
                        chk = true;
                    }
                }
            }

            System.out.println(L);
        }
    }
}