package src.Section7;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

        Dog dog = new Dog();
        dog.sound();

        animalSound(cat);
        animalSound(dog);
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
