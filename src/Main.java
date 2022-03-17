public class Main {
    public static void main(String[] args){
        PetrolEngine petrolEngine1 = new PetrolEngine(250,"АИ-98");
        PetrolEngine petrolEngine2 = new PetrolEngine(140,"АИ-95");

        DieselEngine dieselEngine1 = new DieselEngine(190);
        DieselEngine dieselEngine2 = new DieselEngine(245);

        ManualTransmission manualTransmission1 = new ManualTransmission(1000);
        ManualTransmission manualTransmission2 = new ManualTransmission(1500);

        AutomaticTransmission automaticTransmission1 = new AutomaticTransmission(2000);
        AutomaticTransmission automaticTransmission = new AutomaticTransmission(2500);

        RoboticGearbox roboticGearbox1 = new RoboticGearbox(1400);
        RoboticGearbox roboticGearbox2 = new RoboticGearbox(1800);

        Car car1 = new Car("Audi",25000,Currency.EUR,260, petrolEngine1,manualTransmission1,300);
        car1.start();

        System.out.println();

        Car car2 = new Car("BMW",31500,Currency.USD,270, dieselEngine1,roboticGearbox2,200);
        car2.start();

         //  Wheel wheel = new Wheel(18);
         //  Bag bag = new Bag(4,5,12);

        car1.load(new Wheel(16));
        car1.load(new Wheel(16));
        car1.load(new Wheel(16));
        car1.load(new Wheel(16));
        car1.load(new Bag(4,5,5));


        System.out.println(car1.calculatePrice()> car2.calculatePrice());
    } 
}
