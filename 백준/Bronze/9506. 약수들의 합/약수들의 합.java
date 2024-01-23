import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                int n = Integer.parseInt(br.readLine());
                if(n == -1) break;

                int[] arr = new int[n-1];
                int sum = 0;
                int cnt = 0;
                StringBuilder sb = new StringBuilder();

                sb.append(n).append(" ");

                for(int i=0;i<n-1;i++){
                    if(n % (i+1) == 0) {
                        arr[cnt] = i+1;
                        cnt++;
                        sum += (i+1);
                    }
                }

                if(n == sum){
                    sb.append("= ");
                    sb.append(arr[0]).append(" ");
                    for(int i=1;i<n-1;i++){
                        if(arr[i] == 0) break;
                        sb.append("+ ").append(arr[i]).append(" ");
                    }
                    System.out.println(sb);
                }
                else{
                    sb.append("is NOT perfect.");
                    System.out.println(sb);
                }
            }
        }
    }
}