package Java_Study.Inheritance.Section04;

public class CarExample {
    public static void main(String[] args){
        Car car = new Car();

        for (int i = 1; i<5; i++){
            int problemLocation = car.run();
            if ( problemLocation != 0){
                System.out.printf("%s HanKookTire로 교체",car.tires[problemLocation -1].location);
                car.tires[problemLocation-1] = new HanKookTire(car.tires[problemLocation -1].location, 15);
            }
        }
    }
}
