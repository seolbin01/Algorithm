import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] L;
    static int[] J;
    static int[] sejun;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        L = new int[N + 1];

        for (int i=1;i<=N;i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        J = new int[N + 1];

        for (int i=1;i<=N;i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }

        sejun = new int[101];

        for (int i=1;i<=N;i++) {
            int loss = L[i];
            int joy = J[i];

            for (int j=99;j>=loss;j--) {
                sejun[j] = Math.max(sejun[j], sejun[j-loss] + joy);
            }
        }

        int maxJoy = 0;
        for (int i=1;i<100;i++) {
            maxJoy = Math.max(maxJoy, sejun[i]);
        }
        
        System.out.println(maxJoy);
    }
}