package Java_Study.Generic;

public class ProductExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("SmartTV");
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("Disel");
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
