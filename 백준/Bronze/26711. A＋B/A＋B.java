import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger result = numA.add(numB);

        System.out.println(result.toString());
    }
}