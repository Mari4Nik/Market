import java.util.Scanner;

/*
Magic Numbers Principle- в проекте вместо чисел используется products.length;
Don't Repeat Yourself (DRY) - повторяющийся вывод списка продуктов на экран выносим в отдельный метод printProucts;
Применение принципов SOLID, а именно:
1) Принцип единственной ответственности Single Responsibility Principle - классы Case, Phone, PowerUs, HeadPhones
описывают только те функции, для которых предназначены;
2) Принцип Open Closed Principle - имплементируя интерфейс Accessories, тем самым добавляя классу функциональности,
не изменяя его код;
3) Принцип замены Liskov substitution Principle: классы Case, Phone, PowerUs, HeadPhones играют роль предков;
4) Принцип сегрегации Interface Segregation Principle - применение разных интерфейсов Accessories, Mobile, SmsSend
 вместо одного большого;
5) Принцип инверсии зависимостей Dependency Inversion Principle - разделив интерфейсы,тем самым мы не зависим от
их общей функциональности, появляется возможность поменять один интерфейс на другой.
 */

public class Main {

    public static void main(String[] args) {

        Catalog[] products = {new Case(), new HeadPhones(), new PowerUsb(), new Phone()};

        printProucts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество или введите `end` ");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProucts(products);
        printBasket(products);
    }

    private static void printProucts(Catalog[] products) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Catalog[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Catalog product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'= " + product.getCount() + " шт."
                        + " 'цена'= " + product.getPrice() + " " + "рублей"
                        + " 'стоимость'= " + product.getCount() * product.getPrice() + " " + "рублей");
            }
        }
        System.out.println("Итого: " + costProducts + " " + "рублей");
    }
}
