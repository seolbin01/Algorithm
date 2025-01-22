import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] pattern = br.readLine().split("\\*");

        String start = pattern[0];
        String end = pattern[1];

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            if (str.length() >= start.length() + end.length() &&
                    str.startsWith(start) &&
                    str.endsWith(end)) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.print(sb);
    }
}