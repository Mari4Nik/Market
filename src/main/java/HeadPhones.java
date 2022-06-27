public class HeadPhones extends Catalog implements Accessories {

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
