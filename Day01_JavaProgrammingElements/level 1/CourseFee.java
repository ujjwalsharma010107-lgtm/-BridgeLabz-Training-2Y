//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

public class CourseFee {
    public static void main(String[] args){

        //storing the course fee
        int fee = 125000;

        //storing the discount percent
        int discountPercent = 10;

        //calculating the discount amount
        double discount = (fee * discountPercent) / 100.0;

        //calculating the final fee after discount
        double finalFee = fee - discount;

        //displaying the required result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
