import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            int num = 0;
            for(int i=0;i<N;i++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());
                int c = Integer.parseInt(st1.nextToken());

                if(a >= L && b >= L && c >= L){
                    if(a+b+c >= K){
                        num++;
                        sb.append(a + " ");
                        sb.append(b + " ");
                        sb.append(c + " ");
                    }
                }
            }
            System.out.println(num);
            System.out.println(sb);
        }
    }
}