public class PowerUsb extends Catalog implements Accessories, Device {

//  Interface Segregation Principle - применяем разные интерфейсы вместо одного большого

    private final String name = "Зарядное устройство";
    private final int price = 3500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void addition() {
        System.out.println("Телефон заряжен");

    }

    @Override
    public void takeWithYou() {

    }
}
