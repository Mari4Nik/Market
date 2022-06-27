public class Phone extends Catalog implements SmsSend, Mobile, Device {


    private final String name = "Телефон";
    private final int price = 25000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }


    @Override
    public void sendSMS() {
        System.out.println("Напиши мне, напиши");

    }

    @Override
    public void inTouch() {
        System.out.println("На связи");

    }

    @Override
    public void takeWithYou() {
        System.out.println("Я всегда с собой беру");

    }
}
