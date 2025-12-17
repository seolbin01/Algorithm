import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0;i<N;i++) {
            String cur = br.readLine();

            if (cur.length() >= M) {
                hm.put(cur, hm.getOrDefault(cur, 0) + 1);
            }
        }

        List<String> arr = new ArrayList<>(hm.keySet());

        arr.sort((a, b) -> {
            int countCompare = Integer.compare(hm.get(b), hm.get(a));
            if (countCompare != 0) return countCompare;

            int lengthCompare = Integer.compare(b.length(), a.length());
            if (lengthCompare != 0) return lengthCompare;

            return a.compareTo(b);
        });
        
        for (String word : arr) {
            bw.write(word + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
