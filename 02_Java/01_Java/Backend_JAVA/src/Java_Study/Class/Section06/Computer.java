package Java_Study.Class.Section06;

public class Computer {
    int price;
    String maker;
    int monitor;

    public Computer(int price, String maker, int monitor){
        this.price = price;
        this.maker = maker;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", manufature=" + maker +
                ", monitor=" + monitor +
                '}';
    }
}
