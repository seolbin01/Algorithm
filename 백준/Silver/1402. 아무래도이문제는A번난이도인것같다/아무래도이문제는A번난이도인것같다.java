import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<T;i++) {
            br.readLine();
            // 중간 값에 대한 제한이 따로 없으므로 항상 yes
            sb.append("yes\n");
        }

        System.out.print(sb);
    }
}
