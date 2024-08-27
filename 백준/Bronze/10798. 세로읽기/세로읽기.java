import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String[] word = br.readLine().split("");
            for(int j = 0; j < word.length; j++) {
                arr[i][j] = word[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != null) {
                    sb.append(arr[i][j]);
                }
            }
        }

        System.out.println(sb);

    }
}