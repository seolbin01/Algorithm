import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[26];
        int max = 0;
        String str = "";
        while((str = br.readLine()) != null){
            for (int i=0;i<str.length();i++) {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    arr[str.charAt(i) - 'a']++;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]) max = arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(max == arr[i]) System.out.print((char)('a' + i));
        }
        br.close();
    }
}