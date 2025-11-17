import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] narr = new int[N];
        int max = 0;
        for(int i=0;i<N;i++) {
            narr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(narr[i], max);
        }

        int start = 0;
        int end = max;
        int answer = 0;


        while (start <= end) {
            int mid = (start + end) >>> 1;
            long wood = 0;

            for (int i : narr) {
                if (i > mid) {
                    wood += i - mid;
                }
            }

            if (wood >= M) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}