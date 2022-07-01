public class HeadPhones extends Catalog implements Accessories {
    // Open Closed Principle - имплементируя интерфейс Accessories мы добавляем
    // классу функциональности, не изменяя его код

    private final String name = "Наушники";
    private final int price = 2000;

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
        System.out.println("Льётся музыка :)");
    }
}
