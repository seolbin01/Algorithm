import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] narr = new int[n];

        narr[0] = Integer.parseInt(st.nextToken());
        int sum = narr[0];
        int max = narr[0];

        for (int i = 1; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());

            sum = Math.max(sum + narr[i], narr[i]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}