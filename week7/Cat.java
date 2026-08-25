public class Cat extends Animal {
    
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Meow");
    }

    public void scratch() {
        System.out.println(name + " is scratching");
    }
}
