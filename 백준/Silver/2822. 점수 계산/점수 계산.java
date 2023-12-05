import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[][] arr = new int[8][2];

            for(int i=0;i<8;i++){
                arr[i][0] = Integer.parseInt(br.readLine());
                arr[i][1] = i + 1;
            }

            Arrays.sort(arr, (o1,o2) -> Integer.compare(o2[0], o1[0]));

            StringBuilder sb = new StringBuilder();

            ArrayList<Integer> index = new ArrayList<>();

            int sum = 0;
            for(int i=0;i<5;i++){
                sum += arr[i][0];
                index.add(arr[i][1]);
            }

            Collections.sort(index);

            for(int i:index){
                sb.append(i+" ");
            }

            System.out.println(sum);
            System.out.println(sb);
        }
    }
}