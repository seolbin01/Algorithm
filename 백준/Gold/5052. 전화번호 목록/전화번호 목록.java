import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();
            for (int j=0;j<n;j++) {
                list.add(br.readLine());
            }

//            list = list.stream().sorted().toList();  // Java 11에서 컴파일 에러
            Collections.sort(list);  // Java 8+에서 안정적으로 정렬
            
            boolean chk = true;
            for (int j=0;j<n-1;j++) {
                String cur = list.get(j);
                String next = list.get(j+1);

                if (next.startsWith(cur)) {
                    chk = false;
                    break;
                }
            }

            if (chk) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);
    }
}
