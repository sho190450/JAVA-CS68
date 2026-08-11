public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("ไอโบ", 3, "พันธุ์ลาบราดอร์");
        
        System.out.println("======Dog======");
        dog.eat();
        dog.bark();
        dog.sleep();
        dog.showBreed();
        dog.exercise();

        //-------------------------------------------------------
        
        Cat cat = new Cat("่jiejee", 2, "สีขาว-ดำ");
        System.out.println("======Cat======");
        cat.eat();
        cat.meaw();
        cat.sleep();
        cat.showcolor();
        cat.exercise();
        
        //-------------------------------------------------------
        Elephant elephant = new Elephant(
                "ก้านกล้วย", 12,
                "ยาว", 2.0,
                "ใหญ่", 3.5, 5000
        );
        System.out.println("======Elephant======"
        );
        elephant.eat();
        elephant.sleep();
        elephant.exercise();
        elephant.showTusk();
        elephant.showTrunkLength();
        elephant.showEarSize();
        elephant.showHeight();
        elephant.showWeight();
        
        System.out.println();

        //-------------------------------------------------------
         Hippo hippo = new Hippo(
                "หมูเด้ง", 2,
                "สวนสัตว์", "กว้าง",
                30, "หนา", "ดุ"
        );
        System.out.println("======Hippo======");
        hippo.showInfo();
        hippo.showHabitat();
        hippo.showMouthSize();
        hippo.showSwimSpeed();
        hippo.showSkinType();
        hippo.showTemperament();
        
         

    }
    
}
