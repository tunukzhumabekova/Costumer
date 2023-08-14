package SecondTask;

public class Bank {
private String name;
private String password;
private int totalMoney;
public Bank(){

}
   public Bank(String name, String password, int totalMoney) {
        this.name = name;
        this.password = password;
        this.totalMoney = totalMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
