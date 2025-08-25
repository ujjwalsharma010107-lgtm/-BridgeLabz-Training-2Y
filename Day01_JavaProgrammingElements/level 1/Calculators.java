//11. Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations

import java.util.*;

public class Calculator {
    public static void main(String[] args){

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking two numbers as input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // displaying results
        System.out.println("The addition value is " + addition);
        System.out.println("The subtraction value is " + subtraction);
        System.out.println("The multiplication value is " + multiplication);
        System.out.println("The division value is " + division);
    }
}
