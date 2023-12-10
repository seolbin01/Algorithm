import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true){
                String str = br.readLine().replaceAll(" ","");
                int[] arr = new int[26];

                if(str.equals("*")) break;

                for(int i=0;i<str.length();i++){
                    arr[str.charAt(i)-'a']++;
                }

                boolean chk = true;

                for (int i : arr) {
                    if (i == 0) {
                        chk = false;
                        break;
                    }
                }

                if(chk) System.out.println("Y");
                else System.out.println("N");
            }
        }
    }
}