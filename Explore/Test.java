public class Test {
    public static void main(String args[]) {
        Laptop obj = Laptop.Windows;
        System.out.println(obj + " : " + obj.getPrice());

    }
}

enum Laptop {
    Mac(50000), Windows(60000), Samsung(30000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}