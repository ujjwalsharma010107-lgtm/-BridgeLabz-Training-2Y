import java.util.Scanner;

public class GcdLcmCalculator {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: "); int num1 = scanner.nextInt();
        System.out.print("Enter second number: "); int num2 = scanner.nextInt();

        System.out.println("GCD: " + gcd(num1, num2));
        System.out.println("LCM: " + lcm(num1, num2));

        scanner.close();
    }
}