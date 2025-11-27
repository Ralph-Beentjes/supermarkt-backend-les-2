package Supermarket;

public class Customer {
    String name;
    SuperMarket superMarket;

    public void buyItem (String productName, int amount){
        if (productName.equals("bread")){
            superMarket.buyBread(amount);
        } else if (productName.equals("fruit")){
            superMarket.buyFruit(amount);
        } else if (productName.equals("toilet paper")){
            superMarket.buyToiletPaper(amount);
        } else {
            superMarket.buyCheese(amount);
        }
    }

    public void goToSupermarket (SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public Customer(String name){
        this.name = name;
    }
}
