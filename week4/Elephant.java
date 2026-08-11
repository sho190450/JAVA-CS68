public class Elephant extends Animal {

    private String tusk;
    private double trunkLength;
    private String earSize;
    private double height;
    private double weight;

    public Elephant(String name, int age, String tusk, double trunkLength,
                    String earSize, double height, double weight) {
        super(name, age);
        this.tusk = tusk;
        this.trunkLength = trunkLength;
        this.earSize = earSize;
        this.height = height;
        this.weight = weight;
    }

    public void showTusk() {
        System.out.println("ขนาดงา: " + tusk);
    }

    public void showTrunkLength() {
        System.out.println("ความยาวงวง: " + trunkLength + " เมตร");
    }

    public void showEarSize() {
        System.out.println("ขนาดใบหู: " + earSize);
    }

    public void showHeight() {
    System.out.println("ส่วนสูง: " + height + " เมตร");
    }

    public void showWeight() {
        System.out.println("น้ำหนัก: " + weight + " กิโลกรัม");
    }
}
