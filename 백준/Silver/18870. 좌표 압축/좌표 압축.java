import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        for (int i=0;i<N;i++) {
            if (!rankMap.containsKey(arr2[i])) {
                rankMap.put(arr2[i], rank++);  // rank는 인덱스 저장과 같음. 단, 중복 제외 카운팅되도록
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(rankMap.get(arr[i])).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
