import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class XY {
        int x;
        int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<XY> list = new ArrayList<>();
        StringTokenizer st;
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());

            list.add(
                    new XY(
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken())
                    )
            );
        }

        list.sort(
                Comparator
                        .comparingInt((XY a) -> a.y)
                        .thenComparingInt(a -> a.x)
        );

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            XY cur = list.get(i);
            sb.append(cur.x).append(" ").append(cur.y).append("\n");
        }

        System.out.print(sb);
    }
}
