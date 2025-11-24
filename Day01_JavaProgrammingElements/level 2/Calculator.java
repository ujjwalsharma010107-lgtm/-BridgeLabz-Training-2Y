// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations


import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition of " + number1 + " and " + number2 + " is " + sum);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + diff);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + product);
        System.out.println("The division of " + number1 + " and " + number2 + " is " + div);
    }
}
