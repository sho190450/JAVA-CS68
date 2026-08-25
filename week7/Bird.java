public class Bird extends Animal implements Animal.Flyable {
    
    public Bird(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " jeed jeed");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
    
}
