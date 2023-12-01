import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().replaceAll(" ", "");
            char[] arr = str.toCharArray();
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum += Math.pow(Character.getNumericValue(arr[i]), 2);
            }
            System.out.println(sum%10);
        }
    }
}