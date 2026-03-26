package Lexicon.Hans;

import java.util.ArrayList;

public interface IVendingMachine {

    public void insertCoin(int coin);
    public int getBalance();
    public Product purchaseProduct(int productId);
    public int returnChange();
    public ArrayList<Product> getProducts();
}
