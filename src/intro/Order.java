package intro;

public class Order {
    private int orderID;
    private double ammount;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "intro.Order{" +
                "orderID=" + orderID +
                ", ammount=" + ammount +
                '}';
    }
}
