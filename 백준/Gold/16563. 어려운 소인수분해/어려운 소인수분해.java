import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N];
        int maxVal = 0;
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            maxVal = Math.max(maxVal, arr[i]);
        }

        // 최소 소인수를 구함 (에라토스테네스의 체 변형)
        int[] spf = new int[maxVal + 1];
        for (int i=2;i<=maxVal;i++) {
            if (spf[i] == 0) {
                for (int j=i;j<=maxVal;j+=i) {
                    if (spf[j] == 0) {  // 최초 입력일 때만 갱신 -> 최소 소인수
                        spf[j] = i;
                    }
                }
            }
        }

        for (int x : arr) {
            int cur = x;
            while (cur > 1) {
                sb.append(spf[cur]).append(" ");
                cur /= spf[cur];
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
