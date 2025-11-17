import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] narr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        int[] marr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<M;i++) {
            marr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(narr);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<M;i++) {
            sb.append(binarySearch(narr, marr[i], 0, N - 1));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return 1;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}