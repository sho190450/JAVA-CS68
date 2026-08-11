package week6;

public class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + ": Truck Engine Started");   
    }

    public void RearAttachment() {
        System.out.println(brand + ": ต่อพ่วงหลัง บันทุกได้ 18 ตัน");
    }
}
