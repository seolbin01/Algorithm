import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split("");

        int lchk = 0;
        for(String s : str) {
            if(s.equals("L")) lchk++;
        }

        int cup = Math.min(n,((n+1) - (lchk/2)));

        System.out.println(cup);

        br.close();
    }
}