package Homework6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 3.5, 7, "black", "Persik", true);
        cat.voice();
        cat.toPet();
        cat.play();
        System.out.println("-------------------------");
        Crocodile croco = new Crocodile(2, 25.2, 14, "green", true);
        croco.voice();
        System.out.println("-------------------------");
        Dog dog = new Dog(3, 7.8, 3, "white", "Lucky", true);
        dog.voice();
        dog.swim();
        dog.toPet();
        System.out.println("-------------------------");
        Fish fish = new Fish(4, 0.2, 1, "orange", "Blubie", false);
        fish.voice();
        fish.thoughts();
        System.out.println("-------------------------");
        Giraffe giraffe = new Giraffe(5, 45.7, 12, "yellow", false);
        giraffe.voice();
        System.out.println("-------------------------");
        GuideDog guideDog = new GuideDog(6, 12.4, 9, "brown", "Bucky", true, true);
        guideDog.voice();
        guideDog.toPet();
        guideDog.takeHome();
        guideDog.swim();
        System.out.println("-------------------------");
        Hamster hamster = new Hamster(7, 0.6, 2, "beige", "Rocky", false);
        hamster.voice();
        hamster.toPet();
        System.out.println("-------------------------");
        Lion lion = new Lion(8, 78.9, 16, "golden", true);
        lion.voice();
        System.out.println("-------------------------");
        Wolf wolf = new Wolf(9, 70.0, 10, "grey", true);
        wolf.voice();
        wolf.howl();
    }
}
