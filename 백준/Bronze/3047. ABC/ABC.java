import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];

            for(int i =0;i<3;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            String str = br.readLine();

            StringBuilder sb = new StringBuilder();

            for(int i=0;i<3;i++) {
                if(str.charAt(i) == 'A') sb.append(arr[0]);
                else if(str.charAt(i) == 'B') sb.append(arr[1]);
                else if(str.charAt(i) == 'C') sb.append(arr[2]);
                sb.append(' ');
            }

            System.out.println(sb);
        }
    }
}