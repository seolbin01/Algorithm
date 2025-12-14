import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i=0;i<N;i++) {
            set.add(br.readLine());
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<String> arr = new ArrayList<>();
        for (int i=0;i<M;i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                arr.add(str);
                count++;
            }
        }

        Collections.sort(arr);

        for (String s : arr) {
            sb.append(s).append("\n");
        }

        System.out.println(count);
        System.out.print(sb);
    }
}
