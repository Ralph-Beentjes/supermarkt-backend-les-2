import Supermarket.Product;
import Supermarket.SuperMarket;
import Supermarket.Customer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Product bread = new Product ("bread", 3.5, 20);

        Product fruit = new Product ("fruit", 2.5, 10);

        Product toiletPaper = new Product ("toilet paper", 1.4, 15);

        Product cheese = new Product ("cheese", 5.4, 3);

        SuperMarket supermarket = new SuperMarket(bread, fruit, toiletPaper, cheese);

        Customer customer = new Customer("Ralph");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which product do you want to buy?");
        String product = scanner.nextLine();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();
        customer.goToSupermarket(supermarket);
        customer.buyItem(product, amount);
    }
}
