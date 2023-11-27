import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] cup = {1,0,0};
            int num = Integer.parseInt(br.readLine());

            for (int i=0;i<num;i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int A = Integer.parseInt(st.nextToken()) - 1;
                int B = Integer.parseInt(st.nextToken()) - 1;
                int temp = 0;
                temp = cup[A];
                cup[A] = cup[B];
                cup[B] = temp;
            }

            for(int k=0;k<3;k++){
                if (cup[k] == 1) {
                    System.out.println(k+1);
                    break;
                }
            }
        }
    }
}