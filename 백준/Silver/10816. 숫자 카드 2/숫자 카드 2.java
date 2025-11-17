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
        for (int i = 0; i < N; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] marr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            marr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(narr);
        for (int i=0;i<M;i++) {
            int target = marr[i];
            int count = upperBound(narr, target) - lowerBound(narr, target);
            sb.append(count);
            sb.append(" ");
        }

        System.out.println(sb);
    }

    // 상한선 위치 (target을 초과한 값을 처음 만나는 위치)
    private static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) >>> 1;

            if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return start;
    }

    // 하한선 위치 (target이상의 값을 처음 만나는 위치)
    private static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) >>> 1;

            if (arr[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}