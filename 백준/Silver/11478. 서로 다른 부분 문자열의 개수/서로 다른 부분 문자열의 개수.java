import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        Set<String> set = new HashSet<>();
        StringBuilder sb;
        for (int i=0;i<S.length();i++) {
            sb = new StringBuilder();
            for (int j=i;j<S.length();j++) {
                sb.append(S.charAt(j));
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());
    }
}
