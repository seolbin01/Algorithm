import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = 1000 - n;
        int num = 0;

        if(change >= 500) {
            num += change / 500;
            change %= 500;
        }
        if(change >= 100) {
            num += change / 100;
            change %= 100;
        }
        if(change >= 50) {
            num += change / 50;
            change %= 50;
        }
        if(change >= 10) {
            num += change / 10;
            change %= 10;
        }
        if(change >= 5) {
            num += change / 5;
            change %= 5;
        }

        num += change;

        System.out.println(num);
    }
}