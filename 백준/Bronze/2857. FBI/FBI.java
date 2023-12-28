import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<5;i++){
                String str = br.readLine();
                boolean chk = false;
                for(int k=0;k<str.length()-2;k++) {
                    if(str.charAt(k) == 'F' && str.charAt(k+1) == 'B' && str.charAt(k+2) == 'I'){
                        chk = true;
                    }
                }
                if(chk) sb.append((i+1) + " ");
            }

            if(sb.length() == 0) System.out.println("HE GOT AWAY!");
            else System.out.println(sb);
        }
    }
}