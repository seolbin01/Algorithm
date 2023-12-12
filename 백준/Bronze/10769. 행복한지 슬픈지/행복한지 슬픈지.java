import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            int happy = 0;
            int sad = 0;

            for(int i=0;i<str.length()-2;i++){
                if(str.charAt(i) == ':'){
                    if(str.charAt(i+1) == '-'){
                        if(str.charAt(i+2) == ')'){
                            happy++;
                        }
                        else if(str.charAt(i+2) == '('){
                            sad++;
                        }
                    }
                }
            }

            if(happy == 0 && sad == 0) System.out.println("none");
            else if(happy == sad) System.out.println("unsure");
            else if(happy > sad) System.out.println("happy");
            else System.out.println("sad");
        }
    }
}