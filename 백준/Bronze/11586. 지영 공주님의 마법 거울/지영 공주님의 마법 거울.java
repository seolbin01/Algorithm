import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] arr = new String[N];
            for(int i=0;i<N;i++){
                arr[i] = br.readLine();
            }
            int K = Integer.parseInt(br.readLine());
            if(K == 1){
                for(int i=0;i<N;i++){
                    System.out.println(arr[i]);
                }
            }
            else if(K == 2){
                for(int i=0;i<N;i++){
                    for(int j=0;j<N;j++){
                        System.out.print(arr[i].charAt(N-j-1));
                    }
                    System.out.println();
                }
            }
            else if(K == 3){
                for(int i=0;i<N;i++){
                    System.out.println(arr[N-i-1]);
                }
            }
        }
    }
}