import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            for(int i=0;i<T;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                int cnt = 0;

                for(int j=1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                        if(((j*j)+(k*k)+m)%(j*k) == 0) cnt++;
                    }
                }

                System.out.println(cnt);
            }
        }
    }
}