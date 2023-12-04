import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            char[] arr = "CAMBRIDGE".toCharArray();
            for(int i=0;i<arr.length;i++){
                str = str.replace(String.valueOf(arr[i]),"");
            }
            System.out.println(str);
        }
    }
}