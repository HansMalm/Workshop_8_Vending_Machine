package Lexicon.Hans;

public abstract class Product {

    private int id;
    private String name;
    private int price;
    private int quantity;

    public String getDescription() {
        return "Product id: " + id + ", name: " + name + ", price: " + price + ", quantity: " + quantity + ".";
    }
}
