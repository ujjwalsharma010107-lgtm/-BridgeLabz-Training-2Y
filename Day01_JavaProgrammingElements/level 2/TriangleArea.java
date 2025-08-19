//Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters

import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        double baseIn = base / 2.54;
        double heightIn = height / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in square cm is " + areaCm);
        System.out.println("The Area of the triangle in square inches is " + areaIn);
    }
}
