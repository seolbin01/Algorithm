import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            int d = Integer.parseInt(arr[3]);
            int e = Integer.parseInt(arr[4]);
            int f = Integer.parseInt(arr[5]);

            int x = 0;
            int y = 0;

            loop:
            for(int i=-999;i<1000;i++){
                for(int j=-999;j<1000;j++){
                    if(a*i + b*j == c){
                        if(d*i + e*j == f){
                            x = i;
                            y = j;
                            break loop;
                        }
                    }
                }
            }

            System.out.printf("%d %d",x,y);
        }
    }
}