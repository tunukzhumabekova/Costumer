package SecondTask;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Costumer {
    private String name;
    private Passport passports;
    private Product[] products;
    private Bank banks;


    public Costumer(String name, Passport passports, Product[] products, Bank banks) {
        this.name = name;
        this.passports = passports;
        this.products = products;
        this.banks = banks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassports() {
        return passports;
    }

    public void setPassports(Passport passports) {
        this.passports = passports;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Bank getBanks() {
        return banks;
    }

    public void setBanks(Bank banks) {
        this.banks = banks;
    }



    public void credit (String password,double sum) {
        if (password.equals(banks.getPassword())) {
            System.out.println("Вам выдан кредит в размере:" + sum);
        } else {
            System.out.println("не правильный пароль");
        }


    }  String checkProduct(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Period prosrochka = Period.between(products[i].getMadeInDate(), LocalDate.of(2023, 9, 11));
            if (prosrochka.getMonths() >= 3) {
                return " Товар просроченный";
            } else {
                if (products[i].getIsAlcoholic()) {
                    Period age = Period.between(passports.getDateOfBirth(), LocalDate.now());
                    if (age.getYears() >= 18) {
                        return "Вам больше 18, можете купить этот товар" + products[i];
                    } else {
                        return "Вам нет 18, не можете купить этот товар" + products[i];
                    }
                }
            }
        }
        return "Тут нет алькоголя, можете купить любой товар";
    }




        @Override
        public String toString () {
            return "Costumer{" +
                    "name='" + name + '\'' +
                    ", passports=" + passports +
                    ", products=" + Arrays.toString(products) +
                    ", banks=" + banks +
                    '}';

        }
    }



























//        switchCaseDemo(dataBase);
//    }
//    public static void switchCaseDemo(DataBase dataBase) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("1. Get all costumer products");
//            System.out.println("2. Add product");
//            System.out.println("3. Delete product be name");
//            System.out.println("4. Update costumer by name");
//            System.out.println("5. Payment");
//            System.out.println("6. Credit");
//            System.out.println("7. Check product");
//            System.out.println("8. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter costumer name:");
//                    String productName = scanner.nextLine();
//                    System.out.println(Arrays.toString(dataBase.getAllCostumerProducts(productName)));
//                    break;
//                case 2:
//                    System.out.println(" :");
//                    String pharmacyAddress = scanner.nextLine();
//                    System.out.println(Arrays.toString(dataBase.getAllWorkersByPharmacyAddress(pharmacyAddress)));
//                    break;
//                case 3:
//                    System.out.println("Enter worker name:");
//                    String workerName = scanner.nextLine();
//                    System.out.println(Arrays.toString(new Pharmacy[]{dataBase.getPharmacyByWorkerName(workerName)}));
//                    break;
//                case 4:
//                    System.out.println("Enter medicine name:");
//                    String medicineName = scanner.nextLine();
//                    System.out.println("Enter new price:");
//                    int newPrice = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline
//                    System.out.println(pharmacy.updateMedicinePrice(medicineName, newPrice));
//                    break;
//                case 5:
//                    System.out.println("Enter worker name:");
//                    String workerToDelete = scanner.nextLine();
//                    System.out.println(pharmacy.deleteWorkerByName(workerToDelete));
//                    break;
//                case 6:
//                    System.out.println("Enter medicine name:");
//                    String medicineToDelete = scanner.nextLine();
//                    System.out.println(pharmacy.deleteMedicineByName(medicineToDelete));
//                    break;
//                case 7:
//                    System.out.println("Enter pharmacy name:");
//                    String pharmacyNameToAdd = scanner.nextLine();
//                    System.out.println(Arrays.toString(new String[]{dataBase.addMedicinesToPharmacy(pharmacyNameToAdd)}));
//                    break;
//                case 8:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice.");
//                    break;
//            }
//        } while (choice != 8);
//        scanner.close();
//    }

