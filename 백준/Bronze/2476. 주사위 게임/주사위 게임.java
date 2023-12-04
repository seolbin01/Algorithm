import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int total = 0;
            int max = 0;
            for(int i=0;i<N;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());
                if(A == B && A == C){
                    total = 10000 + A * 1000;
                }
                else if(A == B || A == C ){
                    total = 1000 + A * 100;
                }
                else if(B == C){
                    total = 1000 + B * 100;
                }
                else {
                    total = Math.max(Math.max(A,B),C) * 100;
                }

                max = Math.max(max, total);
            }
            System.out.println(max);
        }
    }
}