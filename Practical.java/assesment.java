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
    class RecycledProduct extends product {

    RecycledProduct(int id,String name, double price){
        super(id, name, price);
    }

    public double getDiscountedPrice() {
        return getPrice() * 0.95;
    }
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
}  
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscountedPrice(){
        return 0;
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
        }
    }