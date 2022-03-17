public class RoboticGearbox extends Transmission{
    public RoboticGearbox(int price) {
        super(price);
    }

    public RoboticGearbox() {
    }
    public void start(){
        System.out.println("Запуск электроматора");
        System.out.println("Выжимаю сцепление");
        System.out.println("Переключаю передачу");
        System.out.println("Отпускаю сцепление");
        System.out.println("Роботизированная КП запущена");
    }
}
