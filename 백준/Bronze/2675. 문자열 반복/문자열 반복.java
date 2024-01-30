import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<N;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                String str = st.nextToken();

                for(int j=0;j<str.length();j++){
                    for(int k=0;k<num;k++){
                        sb.append(str.charAt(j));
                    }
                }
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}