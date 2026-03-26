package Lexicon.Hans;

import java.util.ArrayList;

public class VendingMachineImpl implements IVendingMachine {

   private Product product;
   private int balance;
   private ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void insertCoin(int coin) {
        switch (coin) {
            case 1:
                balance += 1;
                break;
            case 2:
                balance += 2;
                break;
            case 5:
                balance += 5;
                break;
            case 10:
                balance += 10;
                break;
            case 20:
                balance += 20;
                break;
            case 50:
                balance += 50;
                break;
            default:
                System.out.println( coin + " is invalid currency unit!");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product purchaseProduct(int productId) {
        if (productList) {
            productList
        }
        return;
    }

    @Override
    public int returnChange() {
        int change = balance;
        balance = 0;
        return change;
    }

    @Override
    public ArrayList<Product> getProducts() {
        return productList;
    }
}
