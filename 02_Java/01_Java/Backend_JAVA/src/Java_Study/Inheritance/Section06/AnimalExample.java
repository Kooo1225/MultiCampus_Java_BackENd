package Java_Study.Inheritance.Section06;

public class AnimalExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("-----------------------------------------");

        // 변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----------------------------------------");

        // 매개변수의 자동 타입 변환
        animalSound(new Cat());
        animalSound(new Dog());
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
