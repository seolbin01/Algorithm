import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                String str = br.readLine();
                System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
            }
        }
    }
}