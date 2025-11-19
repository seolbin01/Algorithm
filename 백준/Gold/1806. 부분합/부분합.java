import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] narr = new int[N+1];
        for (int i=1;i<N+1;i++) {
            int val = Integer.parseInt(st.nextToken());
            narr[i] = narr[i-1] + val;
        }

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 1;

        while (right <= N) {
            int sum = narr[right] - narr[left];

            if (sum >= S) {
                min = Math.min(min, right - left);
                left++;
            } else {
                right++;
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}