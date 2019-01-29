
public class Main {

    public static void main(String[] args) {
        
        Car defaultCar = new Car();
        
        defaultCar.printAttributes();
        
        
        Car audi = new Car("Audi A4", "BG-1234");
        audi.printAttributes();
        audi.setWeight(1400);
        audi.setConsumption(10);
        audi.printAttributes();
        
        
        Car bmw = new Car("BMW", 200, 1300, "BG-3456", 0, 0, 100, 15);
        bmw.printAttributes();
        bmw.fuelUp();
        bmw.printAttributes();
        
        bmw.travel(4);
        bmw.printAttributes();
        
        bmw.travel(6);
        bmw.printAttributes();
        
 //       double audiWeight = 
        
        
    }
    
}
