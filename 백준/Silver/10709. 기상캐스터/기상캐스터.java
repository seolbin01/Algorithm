import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < H; i++) {
            String row = br.readLine();
            int lastCloud = -1;

            for (int j = 0; j < W; j++) {
                char c = row.charAt(j);

                if (c == 'c') {
                    sb.append(0);
                    lastCloud = j;
                } else {
                    if (lastCloud == -1) {
                        sb.append(-1);
                    } else {
                        sb.append(j - lastCloud);
                    }
                }

                if (j < W - 1) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
