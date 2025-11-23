import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] minusArr = str.split("-");

        int total = 0;

        String[] num1 = minusArr[0].split("\\+");
        int sum1 = 0;
        for (String n : num1) {
            sum1 += Integer.parseInt(n);
        }

        total += sum1;

        for (int i=1;i<minusArr.length;i++) {
            String[] num = minusArr[i].split("\\+");
            int sum = 0;
            for (String n : num) {
                sum += Integer.parseInt(n);
            }

            total -= sum;
        }

        System.out.println(total);
    }
}