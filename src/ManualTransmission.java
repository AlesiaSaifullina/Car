public class ManualTransmission extends Transmission{

    public ManualTransmission(int price) {
        super(price);
    }

    public ManualTransmission() {
    }
    public void start(){
        System.out.println("Выжимаю сцепление");
        System.out.println("Включаю первую передачу");
        System.out.println("Отпускаю сцепление");
        System.out.println("Добавляю газ");
        System.out.println("Механическая КП запущена");
    }
}
