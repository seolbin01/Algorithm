import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[26];

        int count = 1;
        for(char c : str.toCharArray()) {
            int index = c - 'a';
            if(arr[index] == 0) {
                arr[index] = count;
            }
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for(int n : arr) {
            sb.append(n-1).append(" ");
        }

        System.out.println(sb);

        br.close();
    }

}