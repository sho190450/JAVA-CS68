package week6;

public class Main {


    public static void main(String[] args) {
        Car v1 = new Car("BMW");
        Motorcycle v2 = new Motorcycle("Yamaha");
        Truck v3 = new Truck("mitsubishi");

        v1.startEngine();
        v1.turnLeft();
        v1.turnRight();
        v2.startEngine();
        v2.fireEx();
        v2.wheel();
        v3.RearAttachment();

        System.out.println("----------------------");

        v1.stopEngine();
        v2.stopEngine();
        v3.startEngine();
    }
}