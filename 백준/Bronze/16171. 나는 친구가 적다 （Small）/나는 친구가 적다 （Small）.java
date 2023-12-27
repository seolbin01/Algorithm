import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String S = br.readLine();
            String K = br.readLine();

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<S.length();i++){
                if(Character.isAlphabetic(S.charAt(i))) sb.append(S.charAt(i));
            }

            boolean chk = false;

            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i) == K.charAt(0)){
                    if(K.length() == 1){
                        chk = true;
                        break;
                    }
                    int num = i+1;
                    for(int j=1;j<K.length();j++){
                        if(sb.charAt(num) != K.charAt(j)) break;
                        if(j == K.length()-1) chk = true;
                        num++;
                    }
                    if(chk) break;
                }
            }
            if(chk) System.out.println("1");
            else System.out.println("0");
        }
    }
}