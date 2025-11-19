import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] narr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1;i<N+1;i++) {
            narr[i] = narr[i-1] + Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int left = 0;
        int right = 1;

        while (right <= N) {
            int sum = narr[right] - narr[left];

            if (sum == M) {
                count++;
                right++;
            } else if (sum > M) {
                left++;
            } else {
                right++;
            }
        }

        System.out.println(count);
    }
}