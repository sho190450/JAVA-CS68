package Test;

public abstract class Food {
    protected String name;
    protected String type;

    public Food(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public abstract void prepare();
    public abstract void cook();
}