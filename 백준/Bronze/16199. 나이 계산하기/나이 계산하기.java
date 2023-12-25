import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int year1 = Integer.parseInt(st1.nextToken());
            int month1 = Integer.parseInt(st1.nextToken());
            int day1 = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int year2 = Integer.parseInt(st2.nextToken());
            int month2 = Integer.parseInt(st2.nextToken());
            int day2 = Integer.parseInt(st2.nextToken());

            if(year1 == year2){
                System.out.println("0");
                System.out.println("1");
                System.out.println("0");
            }
            else if(year1 < year2){
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();

                if (month1 < month2 || (month1 == month2 && day1 <= day2)) {
                    sb1.append(year2 - year1);
                } else {
                    sb1.append(year2 - year1 - 1);
                }

                sb2.append(year2 - year1 + 1);
                sb3.append(year2 - year1);

                System.out.println(sb1);
                System.out.println(sb2);
                System.out.println(sb3);
            }
        }
    }
}