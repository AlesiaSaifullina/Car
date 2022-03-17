public class AutomaticTransmission extends Transmission{
    public AutomaticTransmission(int price) {
        super(price);
    }

    public AutomaticTransmission() {
    }
    public void start(){
        System.out.println("Выжимаю педаль тормоза");
        System.out.println("Нажимаю кнопку селектора");
        System.out.println("Включаю режим Drive");
        System.out.println("Автоматическая КП запущена");
    }
}
