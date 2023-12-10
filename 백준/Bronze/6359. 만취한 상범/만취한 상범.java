import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                int room = Integer.parseInt(br.readLine());
                int[] arr = new int[room];
                Arrays.fill(arr,0);
                for(int j=0;j<room;j++){
                    for(int k=0;k<room;k++) {
                        if ((k+1) % (j+1) == 0) arr[k]++;
                    }
                }
                int num = 0;
                for(int j=0;j<room;j++){
                    if(arr[j]%2 != 0) num++;
                }
                System.out.println(num);
            }
        }
    }
}