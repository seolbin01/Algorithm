import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                String str = br.readLine();
                if(str.length() >= 6 && str.length() <= 9){
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
        }
    }
}