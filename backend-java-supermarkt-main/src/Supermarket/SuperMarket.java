package Supermarket;

public class SuperMarket {
    public Product bread;
    public Product fruit;
    public Product toiletPaper;
    public Product cheese;

    public void buyItem (Product product, int amount){
        if(amount <= product.amount){
            System.out.println("You bought " + amount + " " + product.name + " for " + product.price);
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void buyBread (int amount){
        buyItem(this.bread, amount);
    }

    public void buyFruit (int amount){
        buyItem(this.fruit, amount);
    }

    public void buyToiletPaper (int amount){
        buyItem(this.toiletPaper, amount);
    }

    public void buyCheese (int amount){
        buyItem(this.cheese, amount);
    }

    public SuperMarket(Product bread, Product fruit, Product toiletPaper, Product cheese) {
        this.bread = bread;
        this.fruit = fruit;
        this.toiletPaper = toiletPaper;
        this.cheese = cheese;
        }



}
