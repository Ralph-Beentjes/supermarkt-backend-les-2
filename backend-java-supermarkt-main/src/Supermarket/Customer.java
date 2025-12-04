package Supermarket;

public class Customer {
    public String name;
    public SuperMarket superMarket;

    public void buyItem (String productName, int amount){
        for (Product product : superMarket.products){
            if (product.name.equalsIgnoreCase(productName)){
                if (product.amount>=amount){
                    System.out.println("You bought " + amount + " " + productName);
                } else {
                    System.out.println("We don't have enough stock of " + productName);
                }
                return;
            }
        }

        System.out.println(superMarket.name + " does not sell " + productName);
    }

    public void goToSupermarket (SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public Customer(String name){
        this.name = name;
    }


}
