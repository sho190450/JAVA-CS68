package week6;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
   
    @Override
    public void startEngine() {
        System.out.println(brand + ": Motorcycle Engine Startted");
    }

    public void fireEx() {
        System.out.println(brand + ":มีท่อไอเสียอยู่ด้านหลัง");
    }

    public void wheel() {
        System.out.println(brand + ": มีล้อ 2 ล้อ");
    }
}
