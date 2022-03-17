public class Car { //все названия классов начинаются с большой буквы (и ссылочные типы данных тоже)
    private String name;                      //модификатор доступа private работает только в рамках одного класса
    private int price;                        //поэтому всегда начинать писать код с этого модификатора
    private Currency currency;
    private int speed;                         //name,price,speed.... это свойства класса
    private Engine engine;              //один из компонентов объекта явл.класс двигатель
    private int capacity;
    private Transmission transmission;
    private Cargo[] cargos = new Cargo[10];

    public Car(String name, int price,Currency currency, int speed,Engine engine,Transmission transmission,int capacity) { //Конструктор-первый выполняемый метод,кот.сразу запускается при
        this.name = name;                                        //создании объекта(некий один "большой сеттер")
        this.price = price;
        this.currency = currency;
        this.speed = speed;                          //this нужен чтобы не было конфликта имен
        this.engine = engine;
        this.transmission = transmission;
        this.capacity = capacity;
    }

    public Car() {}                           //всегда создавать пустой(дефолтный)конструктор

    public String getName() {                 //метод геттер позволяет получать(выводить) значение вне класса
        return name;                          //названия методов и переменных пишутся с маленькой буквы
    }

    public void setName(String name) {        //метод сеттер позволяет изменять значение вне класса
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double calculatePrice(){
        if (currency==Currency.EUR){
            return price * 90;
        }else if (currency==Currency.USD){
            return price * 75;
        }else {
            return price;
        }
    }

    public void load(Cargo cargo){
        if (cargo.getWeight() <= capacity){
            for (int i = 0; i < cargos.length; i++){
                if(cargos[i] == null){
                    cargos[i] = cargo;
                    capacity -= cargo.getWeight();
                    System.out.println("Загрузили " + cargo.getWeight()+" кг, осталось "+ capacity+" кг");
                    break;
                }
            }

        } else {
            System.out.println("Слишком тяжелый.Места нет.");
        }

    }

    public void start(){
        System.out.println("Проверка автомобиля");
        System.out.println("Запуск двигателя");
        engine.start();
        transmission.start();
        System.out.println(name+" запустился");
    }

    public void stop(){
        System.out.println(name+ " остановился");
    }

}
