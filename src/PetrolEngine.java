public class PetrolEngine extends Engine {
    private String fuel;

    public PetrolEngine(int power, String fuel) {
        super(power);
        this.fuel = fuel;
    }

    public PetrolEngine(){}

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void start(){
        System.out.println("Проверка двигателя");
        System.out.println("Запуск стартера");
        System.out.println("Начинаю искрить");
        System.out.println("Запуск бензинового двигателя: "+getPower()+" "+fuel);
    }

}
