public abstract class Transmission {
    private int price;

    public Transmission(int price) {
        this.price = price;
    }

    public Transmission() {}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public abstract void start();
}
