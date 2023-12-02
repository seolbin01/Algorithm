import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i=0;i<3;i++){
                String str = br.readLine().replaceAll(" ","");
                int[] arr = new int[4];
                for(int k=0;k<4;k++){
                    arr[k] = str.charAt(k) - '0';
                }
                Arrays.sort(arr);
                StringBuilder result = new StringBuilder();
                if(arr[3] == 0){
                    result.append("D");
                } else if (arr[2] == 0) {
                    result.append("C");
                } else if (arr[1] == 0) {
                    result.append("B");
                } else if (arr[0] == 0) {
                    result.append("A");
                } else {
                    result.append("E");
                }
                System.out.println(result);
            }
        }
    }
}