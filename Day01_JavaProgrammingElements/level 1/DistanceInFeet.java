//Write a program to find the distance in yards and miles for the distance provided by the user in feet


import java.util.*;

public class DistanceInFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        int distanceFeet = sc.nextInt();

        int yards = distanceFeet / 3;
        int miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
