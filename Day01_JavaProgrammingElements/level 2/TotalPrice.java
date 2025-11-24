//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.


import java.util.*;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price: ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        int total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);
    }
}
