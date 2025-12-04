package Supermarket;

import java.util.List;

public class SuperMarket {
    public List<Product> products;
    public String name;

    public void buyItem (Product product, int amount){
        if(amount <= product.amount){
            System.out.println("You bought " + amount + " " + product.name + " for " + product.price);
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void restockItem (String productName, int amount){
        for (Product product : this.products){
            if (product.name.equalsIgnoreCase(productName)){
                product.amount = product.amount + amount;
            }
            return;
        }

        System.out.println("You cannot restock " + productName + ", we don't have that in our inventory.");
    }

    public SuperMarket(List<Product> products, String name) {
            this.products = products;
            this.name = name;
        }

// stuk tekst zodat ik kan comitten

}
