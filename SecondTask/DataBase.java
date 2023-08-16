package SecondTask;

import java.util.Arrays;

public class DataBase {
    private Costumer[] costumers;

    public DataBase() {

    }

    public DataBase(Costumer[] costumers) {
        this.costumers = costumers;
    }

    public Costumer[] getCostumers() {
        return costumers;
    }

    public void setCostumers(Costumer[] costumers) {
        this.costumers = costumers;
    }

    Product[] getAllCostumerProducts(String name) {
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getName().equals(name)) {
                return costumers[i].getProducts();
            }

        }
        return null;
    }
    String addProduct(String costumerName, Product newProduct) {
        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getName().equals(costumerName)) {
                Product[] existingProducts = costumers[i].getProducts();

                Product[] newProducts = Arrays.copyOf(existingProducts, existingProducts.length + 1);
                newProducts[existingProducts.length] = newProduct;

                costumers[i].setProducts(newProducts);

                return "Product added to " + costumerName;
            }
        }

        return "Costumer not found: " + costumerName;
    }


    String deleteProductByName(String costumerName, String productName) {
        for (Costumer costumer : costumers) {
            if (costumer.getName().equals(costumerName)) {
                Product[] existingProducts = costumer.getProducts();

                for (int j = 0; j < existingProducts.length; j++) {
                    if (existingProducts[j].getName().equals(productName)) {
                        Product[] newProducts = new Product[existingProducts.length - 1];
                        System.arraycopy(existingProducts, 0, newProducts, 0, j);
                        System.arraycopy(existingProducts, j + 1, newProducts, j, existingProducts.length - j - 1);

                        costumer.setProducts(newProducts);
                        return "Product '" + productName + "' deleted from " + costumerName;
                    }
                }

                return "Product '" + productName + "' not found in " + costumerName;
            }
        }

        return "Costumer not found: " + costumerName;
    }

    public Costumer updateCostumerByName(String bookName, String newName) {

        for (int i = 0; i < costumers.length; i++) {
            if (costumers[i].getName().equals(bookName)) {
                costumers[i].setName(newName);
                return costumers[i];
            }
        }

        return null;






    } String payment(String name, String password,double sum){
            for (int i = 0; i < costumers.length; i++) {
                if (costumers[i].getBanks().getName().equals(name)) {
                    if (costumers[i].getBanks().getPassword() == password) {
                        if (sum <= costumers[i].getBanks().getTotalMoney()) {
                            return "Остаток вашего баланса " + (costumers[i].getBanks().getTotalMoney() - sum);
                        } else {
                            return "У вас недостаточно средств";
                        }
                    }
                }
            }
            return "Неправильное имя пользователья или счет";
        }






@Override
        public String toString () {
            return "DataBase{" +
                    "costumers=" + Arrays.toString(costumers) +
                    '}';
        }

    }

