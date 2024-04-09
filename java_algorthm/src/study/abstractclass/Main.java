package study.abstractclass;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("Sparrow");
        Animal dog = new Dog("Buddy");

        bird.makeSound();
        dog.makeSound();

    }
}
