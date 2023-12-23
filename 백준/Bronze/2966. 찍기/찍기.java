import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[3];
            char[] arrA = {'A','B','C'};
            char[] arrB = {'B','A','B','C'};
            char[] arrC = {'C','C','A','A','B','B'};

            String str = br.readLine();

            if(str.charAt(0) == arrA[0]) arr[0]++;
            if(str.charAt(0) == arrB[0]) arr[1]++;
            if(str.charAt(0) == arrC[0]) arr[2]++;

            for(int i=1;i<N;i++){
                if(str.charAt(i) == arrA[i%3]) arr[0]++;
                if(str.charAt(i) == arrB[i%4]) arr[1]++;
                if(str.charAt(i) == arrC[i%6]) arr[2]++;
            }

            int max = 0;
            for(int i=0;i<3;i++){
                max = Math.max(max,arr[i]);
            }
            System.out.println(max);

            for(int i=0;i<3;i++){
                if(max == arr[i]){
                    switch (i){
                        case 0:
                            System.out.println("Adrian");
                            break;
                        case 1:
                            System.out.println("Bruno");
                            break;
                        case 2:
                            System.out.println("Goran");
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}