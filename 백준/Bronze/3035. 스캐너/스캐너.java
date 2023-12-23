import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int ZR = Integer.parseInt(st.nextToken());
            int ZC = Integer.parseInt(st.nextToken());
            char[][] arr = new char[R][C];

            for(int i=0;i<R;i++){
                String str = br.readLine();
                for(int j=0;j<C;j++){
                    arr[i][j] = str.charAt(j);
                }
            }

            for(int i=0;i<R;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<C;j++){
                    sb.append(String.valueOf(arr[i][j]).repeat(ZC));
                }
                for(int k=0;k<ZR;k++) {
                    System.out.println(sb);
                }
            }
        }
    }
}