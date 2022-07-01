public class Case extends Catalog implements Accessories {
    // Single Responsibility Principle - класс Case описывает только чехол, а не все товары;

    private final String name = "Чехол";
    private final int price = 790;

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
        System.out.println("Телефон защищён");

    }
}
