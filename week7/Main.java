public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucky");

        dog.makeSound();
        dog.eat();
        dog.run();

        Cat cat = new Cat("jiejee");
        cat.makeSound();
        cat.eat();
        cat.scratch();

        Bird bird = new Bird("Tweety");
        bird.makeSound();
        bird.eat();
        bird.fly();
    }
    
}