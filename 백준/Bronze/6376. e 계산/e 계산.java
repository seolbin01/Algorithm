
public class Main {
    public static void main(String[] args) {
        System.out.println("n e");
        System.out.println("- -----------");
        System.out.printf("%d %d\n",0,1);
        System.out.printf("%d %d\n",1,2);
        System.out.printf("%d %.1f\n",2,2.5);

        double sum = 2.5;
        double fac = 2;

        for(int i=3;i<10;i++) {
            fac *= i;
            sum += 1/fac;
            System.out.printf("%d %.9f\n",i,sum);
        }
    }
}