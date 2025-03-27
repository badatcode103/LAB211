/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7;

/**
 *
 * @author ASUS
 */
import java.util.*;

public class FruitManagement {

    private ArrayList<Fruit> fruits = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addFruit() {
        while (true) {
            System.out.print("Enter Fruit ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Fruit Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Origin: ");
            String origin = scanner.nextLine();

            fruits.add(new Fruit(id, name, price, quantity, origin));
            System.out.print("Do you want to add another fruit? (Y/N): ");
            if (!scanner.nextLine().equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    public void displayFruits() {
        System.out.printf("%-5s %-10s %-10s %-5s %-15s\n", "ID", "Name", "Price", "Qty", "Origin");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void shopping() {
        if (fruits.isEmpty()) {
            System.out.println("No fruits available for shopping.");
            return;
        }
        displayFruits();
        ArrayList<Fruit> cart = new ArrayList<>();
        while (true) {
            System.out.print("Select Fruit ID to buy: ");
            String fruitId = scanner.nextLine();
            Fruit fruit = findFruitById(fruitId);
            if (fruit == null) {
                System.out.println("Invalid Fruit ID. Try again.");
                continue;
            }
            System.out.print("Enter quantity: ");
            int qty = Integer.parseInt(scanner.nextLine());
            if (qty > fruit.getQuantity()) {
                System.out.println("Not enough stock.");
                continue;
            }
            cart.add(new Fruit(fruit.getId(), fruit.getName(), fruit.getPrice(), qty, fruit.getOrigin()));

            fruit.setQuantity(fruit.getQuantity() - qty);
            System.out.print("Do you want to buy more? (Y/N): ");
            if (!scanner.nextLine().equalsIgnoreCase("Y")) {
                break;
            }
        }
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        orders.add(new Order(name, cart));
        System.out.println("Order placed successfully!");
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println("Customer: " + order.getCustomerName());
            double total = 0;
            for (Fruit fruit : order.getItems()) {
                double amount = fruit.getPrice() * fruit.getQuantity();
                System.out.printf("%-10s %-5d %-5.2f %-5.2f\n", fruit.getName(), fruit.getQuantity(), fruit.getPrice(), amount);
                total += amount;
            }
            System.out.println("Total: " + total + "$\n");
        }
    }

    private Fruit findFruitById(String id) {
        for (Fruit fruit : fruits) {
            if (fruit.getId().equals(id)) {
                return fruit;
            }
        }
        return null;
    }

    public void run() {
        while (true) {
            System.out.println("\n===== FRUIT SHOP MANAGEMENT =====");
            System.out.println("1. Add Fruit");
            System.out.println("2. View Available Fruits");
            System.out.println("3. Buy Fruits");
            System.out.println("4. View Orders");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addFruit();
                    break;
                case "2":
                    displayFruits();
                    break;
                case "3":
                    shopping();
                    break;
                case "4":
                    viewOrders();
                    break;
                case "5":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

}

class Order {

    private String customerName;
    private ArrayList<Fruit> items;

    public Order(String customerName, ArrayList<Fruit> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Fruit> getItems() {
        return items;
    }
}
