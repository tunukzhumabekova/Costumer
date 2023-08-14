package SecondTask;

import java.time.LocalDate;

public class Product {
    private String name;
    private String direction;
    private int price;
    private int quantity;
    private LocalDate MadeInDate;
private boolean IsAlcoholic;
    public Product(){

    }

    public Product(String name, String direction, int price, int quantity, LocalDate madeInDate, boolean isAlcoholic) {
        this.name = name;
        this.direction = direction;
        this.price = price;
        this.quantity = quantity;
        MadeInDate = madeInDate;
        IsAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getMadeInDate() {
        return MadeInDate;
    }

    public void setMadeInDate(LocalDate madeInDate) {
        MadeInDate = madeInDate;
    }

    public boolean getIsAlcoholic() {
        return IsAlcoholic;
    }

    public void setIsAlcoholic(boolean isAlcoholic) {
        IsAlcoholic = isAlcoholic;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", MadeInDate=" + MadeInDate +
                ", IsAlcoholic='" + IsAlcoholic + '\'' +
                '}';
    }
}
