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

        st = new StringTokenizer(br.readLine());
        int[] narr = new int[N];
        narr[0] = Integer.parseInt(st.nextToken());
        for (int i=1;i<N;i++) {
            narr[i] = narr[i-1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int sum = 0;
            if (start == 1) {
                sum = narr[end-1];
            } else {
                sum = narr[end-1] - narr[start-2];
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}