public class Hippo extends Animal {

    private String habitat;
    private String mouthSize;
    private double swimSpeed;
    private String skinType;
    private String temperament;

    public Hippo(String name, int age, String habitat, String mouthSize,
                 double swimSpeed, String skinType, String temperament) {
        super(name, age);
        this.habitat = habitat;
        this.mouthSize = mouthSize;
        this.swimSpeed = swimSpeed;
        this.skinType = skinType;
        this.temperament = temperament;
    }

    public void showHabitat() {
    System.out.println("ที่อยู่อาศัย: " + habitat);
    }

    public void showMouthSize() {
    System.out.println("ขนาดปาก: " + mouthSize);
    }

    public void showSwimSpeed() {
    System.out.println("ความเร็วในการว่ายน้ำ: " + swimSpeed + " กม./ชม.");
    }

    public void showSkinType() {
    System.out.println("ลักษณะผิว: " + skinType);
    }

    public void showTemperament() {
    System.out.println("นิสัย: " + temperament);
    }
}