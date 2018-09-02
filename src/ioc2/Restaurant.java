package ioc2;

public class Restaurant {

    private Waiter waiter;

    public Restaurant() {
        System.out.println("Restaurant()");
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "waiter=" + waiter +
                '}';
    }
}
