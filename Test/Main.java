package Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("============= FOOD INFORMATION =============");

        Food friedRice = new RiceDish("Fried Rice", "Rice Dish");
        Food padThai = new NoodleDish("Pad Thai", "Noodle Dish");
        Beverage icedTea = new Beverage("Iced Tea", "Beverage");

    
        friedRice.displayInfo();
        friedRice.prepare();
        friedRice.cook();
        System.out.println("--------------------------------------------");


        padThai.displayInfo();
        padThai.prepare();
        padThai.cook();
        System.out.println("--------------------------------------------");


       
        icedTea.displayInfo();
        icedTea.prepare();
        icedTea.cook();
         System.out.println("============= COLD FOOD / BEVERAGE =============");
        icedTea.serveCold();
    }
}
