package Test;

public class Beverage extends Food implements ColdServable {

    public Beverage(String name, String type) {
        super(name, type);
    }

    @Override
    public void prepare() {
        System.out.println("Action: " + name + " is being prepared.");
    }

    @Override
    public void cook() {
        System.out.println("Action: " + name + " is served cold.");
    }

    @Override
    public void serveCold() {
        System.out.println("Action: " + name + " can be served cold.");
    }
}
