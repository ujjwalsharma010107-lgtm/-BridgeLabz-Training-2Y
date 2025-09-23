import java.util.*;

abstract class product {
    private int id;
    private String name;
    private double price;

    public product(int id, String name, double price){
        setId(id);
        setName(name);
        setPrice(price);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }




    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscountedPrice(){
        return 0;
    }

    public void displayProductInfo(){
        System.out.println(getId());
        System.out.println(getPrice());
        System.out.println(getName());
        System.out.println(getDiscountedPrice());
    }
}

class OrganicProduct extends product {

    OrganicProduct(int id,String name, double price){
        super(id, name, price);
    }

    public double getDiscountedPrice() {
        return getPrice() * 0.90;
    }
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() + ", Base Price: " + getPrice() +
               ", Discounted Price: " + getDiscountedPrice();
    }
}

class RecycledProduct extends product {

    RecycledProduct(int id,String name, double price){
        super(id, name, price);
    }

    public double getDiscountedPrice() {
        return getPrice() * 0.95;
    }

     public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() + ", Base Price: " + getPrice() +
               ", Discounted Price: " + getDiscountedPrice();
}

class cart{
    int product[];
    int size;
    int index = 0;
    cart(int size){
        size = this.size;
        product = new int[size];
    }

    public void addproducts(product p){
        product[index] = p;
        index++;
    }

    public void addproducts(product... items){
        for(product p : items){
            addproducts(p);
            index++;
        }
    }

    public void addproducts(int quantity, int productid){
        System.out.println("added" + quantity + "units of product id" + quantity);
    }

     public void printCartItems() {
        System.out.println("Items in Cart:");
        for (int i = 0; i < index; i++) {
            System.out.println(products[i]);
        }
    }

    public final void printBillHeader() {
        System.out.println("******* EcoCart Bill ********");
    }

    public void printBill() {
        printBillHeader();
        double grandTotal = 0;
        for (int i = 0; i < index; i++) {
            Product p = products[i];
            double discounted = p.getDiscountedPrice();
            double tax = discounted * TAX_RATE;
            double total = discounted + tax;
            System.out.println("Item: " + p.getName() + ", Price: " + discounted + ", Tax: " + tax + ", Total: " + total);
            grandTotal += total;
        }
        System.out.println("----------------------------");
        System.out.println("Grand Total: " + grandTotal);
    }

    public static int getCartCount() {
        return totalCartsCreated;
    }
}

final class EcoRules {
    public static void showRules() {
        System.out.println("Use eco-friendly bags.");
        System.out.println("Recycle waste responsibly.");
    }
}