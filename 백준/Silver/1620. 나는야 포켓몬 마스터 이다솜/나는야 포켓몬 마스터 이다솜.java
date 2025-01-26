import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        Map<String, Integer> hm = new HashMap<>();

        for (int i=0;i<n;i++) {
            arr[i] = br.readLine();
            hm.put(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<m;i++) {
            String str = br.readLine();

            if (Character.isDigit(str.charAt(0))) {
                sb.append(arr[Integer.parseInt(str) - 1]).append("\n");
            } else {
                sb.append((hm.get(str) + 1)).append("\n");
            }
        }

        System.out.print(sb);
    }
}