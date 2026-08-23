package Test;

public class NoodleDish extends Food {

    public NoodleDish(String name, String type) {
        super(name, type);
    }

    @Override
    public void prepare() {
        System.out.println("Action: " + name + " is being prepared.");
    }

    @Override
    public void cook() {
        System.out.println("Action: " + name + " is being cooked with noodles.");
    }
}
