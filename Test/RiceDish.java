package Test;

public class RiceDish extends Food {

    public RiceDish(String name, String type) {
        super(name, type);
    }

    @Override
    public void prepare() {
        System.out.println("Action: " + name + " is being prepared.");
    }

    @Override
    public void cook() {
        System.out.println("Action: " + name + " is ready to serve.");
    }
}
