import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int bird = Integer.parseInt(br.readLine());
            int time = 0;
            int num = 1;
            while(bird>0){
                if(bird >= num) {
                    bird -= num;
                    num++;
                    time++;
                }
                else {
                    num = 1;
                }
            }
            System.out.println(time);
        }
    }
}