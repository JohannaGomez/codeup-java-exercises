package products;

// this is the PARENT:

public class Product {

    protected int price;
    protected int inventory;

    // Constructor:
    public Product(int price, int inventory) {
        this.price = price;
        this.inventory = inventory;
    }

    // Default constructor for the children:
    public Product() {

    }

    public int valueOfInventory() {
        return price * inventory;
    }

}
