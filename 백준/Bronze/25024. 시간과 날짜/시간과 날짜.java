import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                StringBuilder sb = new StringBuilder();

                if(A <= 23 && B <= 59) sb.append("Yes ");
                else sb.append("No ");

                switch (A){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (B >= 1 && B <= 31) sb.append("Yes");
                        else sb.append("No");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (B >= 1 && B <= 30) sb.append("Yes");
                        else sb.append("No");
                        break;
                    case 2:
                        if (B >= 1 && B <= 29) sb.append("Yes");
                        else sb.append("No");
                        break;
                    default:
                        sb.append("No");
                        break;
                }
                System.out.println(sb);
            }
        }
    }
}