public class DieselEngine extends Engine{

    public DieselEngine(int power) {
        super(power);
    }

    public DieselEngine(){}

    public void start() {
        System.out.println("Проверка двигателя");
        System.out.println("Накаливаю свечи");
        System.out.println("Качаю салярку");
        System.out.println("Включаю стартер");
        System.out.println("Запуск дизельного двигателя мощностью "+getPower());

    }
}
