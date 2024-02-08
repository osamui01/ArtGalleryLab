public class Customer {

    private String name;
    private float money;

    public Customer(String customerName, float customerMoney){
        this.name = customerName;
        this.money = customerMoney;

    }

    public String getName() {
        return name;
    }

    public void setName(String customerName) {
        this.name = customerName;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void removeMoney(float price){
        this.money -= price;
    }


}
