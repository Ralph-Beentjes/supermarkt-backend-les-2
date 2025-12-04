import Supermarket.Product;
import Supermarket.SuperMarket;
import Supermarket.Customer;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Product bread = new Product ("bread", 3.5, 20);

        Product fruit = new Product ("fruit", 2.5, 10);

        Product toiletPaper = new Product ("toilet paper", 1.4, 15);

        Product cheese = new Product ("cheese", 5.4, 3);

        List<Product> products1 = new ArrayList<>();
        products1.add(bread);
        products1.add(fruit);
        products1.add(toiletPaper);
        products1.add(cheese);

        List<Product> products2 = new ArrayList<>();
        products2.add(bread);
        products2.add(fruit);
        products2.add(toiletPaper);
        products2.add(cheese);

        List<Product> products3 = new ArrayList<>();
        products3.add(bread);
        products3.add(fruit);
        products3.add(toiletPaper);
        products3.add(cheese);

        SuperMarket halbertEijn = new SuperMarket(products1, "halbert eijn");

        SuperMarket dumbo = new SuperMarket(products2, "dumbo");

        SuperMarket caldi = new SuperMarket(products3, "caldi");

        Map<String, SuperMarket> superMarketMap = new HashMap<>();

        superMarketMap.put("halbert eijn", halbertEijn);
        superMarketMap.put("dumbo", dumbo);
        superMarketMap.put("caldi", caldi);

        Customer customer = new Customer("Ralph");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat do you want to do?");
        System.out.println("1 - Pick a supermarket");
        System.out.println("2 - buy a product");
        System.out.println("3 - restock a product");
        System.out.println("4 - exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1: System.out.println("Which supermarket do you want to go to?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                String superMarketChoice = scanner.nextLine().toLowerCase();
                SuperMarket superMarket = superMarketMap.get(superMarketChoice);
                customer.goToSupermarket(superMarket);
                break;
            // Bij het testen van case 2 kan je het beste de break uit case 1 even weghalen en via break 1 doorlopen (anders onthoudt hij de gekozen supermarkt niet bij het testen van de functie in de console)
            case 2: if(customer.superMarket == null) {
                System.out.println("Pick a supermarket first.");
                break;}
                System.out.println("Which product do you want to buy from " + customer.superMarket.name + "?");
                System.out.println("Pick one of the following:");
                System.out.println("0. Bread");
                System.out.println("1. Fruit");
                System.out.println("2. Toilet Paper");
                System.out.println("3. Cheese");
                int productChoice = scanner.nextInt();
                Product product = customer.superMarket.products.get(productChoice);
                System.out.println("How many do you want to add?");
                int productAmount = scanner.nextInt();
                customer.superMarket.buyItem(product, productAmount);
                break;
            case 3: System.out.println("Which supermarket do you want to restock?");
                System.out.println("Pick one of the following:");
                System.out.println("- Halbert Eijn");
                System.out.println("- Dumbo");
                System.out.println("- Caldi");
                String superMarketStock = scanner.nextLine();
                SuperMarket superMarketToRestock = superMarketMap.get(superMarketStock);
                System.out.println("Which product do you want to restock?");
                System.out.println("Pick one of the following:");
                System.out.println("Bread");
                System.out.println("Fruit");
                System.out.println("Toilet Paper");
                System.out.println("Cheese");
                String productToRestock = scanner.nextLine();
                System.out.println("How many do you want to add?");
                int productAmountRestock = scanner.nextInt();
                superMarketToRestock.restockItem(productToRestock, productAmountRestock);
                System.out.println("We added " + productAmountRestock + " to the stock of " + productToRestock);
                break;
            case 4: System.out.println("Goodbye!");
                break;
            default: System.out.println("Invalid choice.");
                break;
        }
    }

}