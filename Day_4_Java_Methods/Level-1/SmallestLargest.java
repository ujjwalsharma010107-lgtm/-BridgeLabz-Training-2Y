import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest = " + result[0] + ", Largest = " + result[1]);
    }
}
