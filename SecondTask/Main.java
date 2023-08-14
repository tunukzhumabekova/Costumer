package SecondTask;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Shampoo", "Personal Care", 5, 50, LocalDate.of(2023, 8, 1),false);
        Product product2 = new Product("Beer", "Beverages", 8, 20, LocalDate.of(2023, 8, 10), true);
        Product product3 = new Product("Chips", "Snacks", 2, 100, LocalDate.of(2023, 7, 10), false);
        Product product4 = new Product("Wine", "Alcohol", 25, 30, LocalDate.of(2024, 12, 1), true);
        Product product5 = new Product("Soap", "Personal Care", 3, 70, LocalDate.of(2023, 7, 25), false);
        Product product6 = new Product("Juice", "Beverages", 4, 40, LocalDate.of(2023, 8, 5), false);
        Product product7 = new Product("Vodka", "Alcohol", 30, 15, LocalDate.of(2023, 5, 20), true);
        Product product8 = new Product("Chocolate", "Snacks", 1, 200, LocalDate.of(2023, 6, 10), false);
        Product product9 = new Product("Water", "Beverages", 1, 1000, LocalDate.of(2023, 7, 30), false);

        Product[] products0 = { product1,product2, product3};
        Product[] products1 = {product4, product5, product6};
        Product[] products2 = {product7, product8, product9};


        Passport passport1 = new Passport(LocalDate.of(1990, 5, 15), "United States", "Male");
        Passport passport2 = new Passport(LocalDate.of(1985, 10, 25), "Canada", "Female");
        Passport passport3 = new Passport(LocalDate.of(2000, 3, 8), "United Kingdom", "Female");

        Bank bank1 = new Bank("ABC Bank", "secure123", 100000);
        Bank bank2 = new Bank("XYZ Bank", "password456", 50000);
        Bank bank3 = new Bank("First Bank", "mybank789", 75000);

        Costumer costumer=new Costumer("Frank",passport1,products0,bank1);
        Costumer costumer1=new Costumer("Lima",passport2,products1,bank2);
        Costumer costumer2=new Costumer("Grace",passport3,products2,bank3);
Costumer []costumers={costumer,costumer1,costumer2};
DataBase dataBase=new DataBase(costumers);
switchCaseDemo(dataBase);
    }

    public static void switchCaseDemo(DataBase dataBase) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Get all customer products");
            System.out.println("2. Add product");
            System.out.println("3. Delete product by name");
            System.out.println("4. Update customer by name");
            System.out.println("5. Payment");
            System.out.println("6. Credit");
            System.out.println("7. Check product");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter customer name:");
                    String customerName = scanner.nextLine();
                    System.out.println(Arrays.toString(dataBase.getAllCostumerProducts(customerName)));
                    break;
                case 2:
                    System.out.println("Enter customer name:");
                    String customerNameToAddProduct = scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Enter customer name:");
                    String customerNameToDeleteProduct = scanner.nextLine();
                    System.out.println("Enter product name:");
                    String productNameToDelete = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Enter customer name:");
                    String customerNameToUpdate = scanner.nextLine();
                    System.out.println("Enter new customer name:");
                    String newCustomerName = scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Enter bank name:");
                    String bankName = scanner.nextLine();
                    System.out.println("Enter bank password:");
                    String bankPassword = scanner.nextLine();
                    System.out.println("Enter payment amount:");
                    double paymentAmount = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Enter bank password:");
                    String bankPasswordForCredit = scanner.nextLine();
                    System.out.println("Enter credit amount:");
                    double creditAmount = scanner.nextDouble();
                    scanner.nextLine();

                    break;
                case 7:
                    System.out.println("Enter product name:");
                    String productToCheck = scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }







    }

