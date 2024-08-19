import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {

                int k = Integer.parseInt(br.readLine());
                TreeMap<Integer, Integer> map = new TreeMap<>();

                for (int j = 0; j < k; j++) {
                    String[] arr = br.readLine().split(" ");
                    int value = Integer.parseInt(arr[1]);
                    if (arr[0].equals("I")) {
                        map.put(value, map.getOrDefault(value, 0) + 1);
                    } else if (arr[0].equals("D") && !map.isEmpty()) {
                        int key = (value == 1) ? map.lastKey() : map.firstKey();;
                        map.computeIfPresent(key, (k1, v) -> (v == 1) ? null : v - 1);
                    }
                }

                if (!map.isEmpty()) {
                    sb.append(map.lastKey()).append(" ").append(map.firstKey());
                } else {
                    sb.append("EMPTY");
                }

                if(i != t-1) sb.append("\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print(sb);
    }
}