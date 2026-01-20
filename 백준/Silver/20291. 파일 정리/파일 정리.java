import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String file = br.readLine();
            int idx = file.indexOf('.');
            String ext = file.substring(idx + 1);
            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }

        System.out.print(sb);
    }
}
