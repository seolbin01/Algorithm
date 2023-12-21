import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            for(int i=0;i<5;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            while (true) {
                for (int i = 0; i < 4; i++) {
                    int temp = 0;
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        for(int j=0;j<5;j++) {
                            System.out.print(arr[j] + " ");
                        }
                        System.out.println();
                    }
                }
                if(arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) break;
            }
        }
    }
}