import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] narr = new int[N];
        for (int i=0;i<N;i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(narr);
        int min = Integer.MAX_VALUE;
        int[] minarr = new int[2];
        int left = 0;
        int right = N-1;
        while (left < right) {
            int sum = narr[left] + narr[right];

            if (Math.abs(sum) < Math.abs(min)) {
                min = sum;
                minarr[0] = narr[left];
                minarr[1] = narr[right];
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println(minarr[0] + " " + minarr[1]);
    }
}