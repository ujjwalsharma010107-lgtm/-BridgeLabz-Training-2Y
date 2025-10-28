import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double si = calculateSI(p, r, t);
        System.out.println("The Simple Interest is " + si +
                           " for Principal " + p +
                           ", Rate of Interest " + r +
                           " and Time " + t);
    }
}
