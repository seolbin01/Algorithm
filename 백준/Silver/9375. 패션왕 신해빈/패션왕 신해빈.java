import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<t;i++) {

            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> hm = new HashMap<>();

            for (int k=0;k<n;k++) {
                String[] str = br.readLine().split(" ");
                hm.put(str[1], hm.getOrDefault(str[1], 0) + 1);
            }

            Set<String> keySet = hm.keySet();

            int total = 1;

            for (String key : keySet) {
                total *= hm.get(key) + 1;
            }

            total -= 1;

            sb.append(total).append("\n");
        }

        System.out.print(sb);
    }
}