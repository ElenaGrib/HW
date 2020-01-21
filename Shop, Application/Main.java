import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Shop newShop = new Shop();
        Scanner scanner = new Scanner(System.in);

        do {
            switch (askFirstQuest()) {
                //Опция 1. Вывод всех товаров
                case 1: {
                    if (newShop.productsList.isEmpty()) {
                        System.out.println("Товары отсутствуют.");
                        break;
                    }
                    switch (askFirstQuest1()) {
                        case 1: {
                            newShop.productsList.sort(Comparator.comparing(Product :: getPrice));
                            for (Product prod : newShop.productsList)
                                System.out.println(prod.getId() + " " + prod.getName() + " " + prod.getPrice());
                            break;
                        }
                        case 2: {
                            newShop.productsList.sort(Comparator.comparing(Product :: getPrice).reversed());
                            for (Product prod : newShop.productsList)
                                System.out.println(prod.getId() + " " + prod.getName() + " " + prod.getPrice());
                            break;
                        }
                        case 3: {
                            newShop.productsList.sort(Comparator.comparing(Product :: getDateTime).reversed());
                            for (Product prod : newShop.productsList)
                                System.out.println(prod.getId() + " " + prod.getName() + " " + prod.getPrice() + " " + prod.getDateTime());
                            break;
                        }
                    }
                    break;
                }
                //Опция 2. Добавление товара
                case 2: {
                    Product newProduct = new Product(inputId(), inputName(), inputPrice());
                    newShop.addProduct(newProduct);
                    break;
                }
                //Опция 3. Удаление товара
                case 3: {
                    if (newShop.productsList.isEmpty()) {
                        System.out.println("Товары отсутствуют.");
                        break;
                    }
                    newShop.deleteProduct(inputId());
                    break;
                }
                //Опция 4. Редактирование товара
                case 4: {
                    if (newShop.productsList.isEmpty()) {
                        System.out.println("Товары отсутствуют.");
                        break;
                    }
                    Product newProduct = new Product(inputId(), inputName(), inputPrice());
                    newShop.editProduct(newProduct);
                    break;
                }
            }
            exitQuest();
        } while (scanner.nextInt() != 0);
    }

    public static int askFirstQuest () {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Выберете действие (введите нужный номер): ");
        System.out.println("1. Вывод всех товаров.");
        System.out.println("2. Добавление товара.");
        System.out.println("3. Удаление товара.");
        System.out.println("4. Редактирование товара");
        System.out.println("0. Выход\n");

        try {
            number = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            return askFirstQuest();
        }
        if (number < 0 || number > 4) {
            return askFirstQuest();
        }
        if (number == 0) {
            System.out.println("Вы закончили программу!");
            System.exit(0);
        }
        return number;
    }


    public static int askFirstQuest1 () {
        Scanner scanner1 = new Scanner(System.in);
        int number1 = 0;
        System.out.println("Выберете, каким способом отсортировать товар (введите нужный номер): ");
        System.out.println("1. По цене (возрастание).");
        System.out.println("2. По цене (убывание).");
        System.out.println("3. Сначала новые, потом старые.");
        System.out.println("0. Выход\n");

        try {
            number1 = scanner1.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            return askFirstQuest1();
        }
        if (number1 < 0 || number1 > 3) {
            return askFirstQuest1();
        }
        if (number1 == 0) {
            System.out.println("Вы закончили программу!");
            System.exit(0);
        }
        return number1;
    }

    public static int inputId () {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите id товара: ");
        int id = 0;
        try {
            id = scanner2.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            return inputId();
        }
        return id;
    }

    public static String inputName () {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите наименование товара: ");
        String name;
        try {
            name = scanner3.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            return inputName();
        }
        return name;
    }

    public static int inputPrice () {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите цену товара: ");
        int price = 0;
        try {
            price = scanner4.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            return inputPrice();
        }
        return price;
    }

    public static void exitQuest () {
        try {
            System.out.println("\nВведите 1, если хотите продолжить, 0 - если хотите закончить.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Попробуйте снова!\n");
            exitQuest();
        }
    }
}