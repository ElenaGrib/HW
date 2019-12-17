//5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//арифметическое элементов каждого массива и сообщите, для какого из
//массивов это значение оказалось больше (либо сообщите, что их средние
//арифметические равны).

import java.util.Random;

public class HW3_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        double totalOne = 0;
        double totalTwo = 0;
        double averageOne = 0;
        double averageTwo = 0;

        for (int i = 0; i < 5; i++) {
            arrayOne[i] = random.nextInt(16);
            arrayTwo[i] = random.nextInt(16);
            totalOne += arrayOne[i];
            totalTwo += arrayTwo[i];
        }

        //Выводим массивы
        System.out.println("Массив 1:");
        for (int e : arrayOne) {
            System.out.print(e + " ");
        }

        System.out.println("\n\nМассив 2:");
        for (int z : arrayTwo) {
            System.out.print(z + " ");
        }

        //Находм среднее арифметическое
        averageOne = totalOne / arrayOne.length;
        averageTwo = totalTwo / arrayTwo.length;
        System.out.println("\n\nСреднее арифметическое Массива 1: " + averageOne);
        System.out.println("Среднее арифметическое Массива 2: " + averageTwo);

        //Проверяем. какому массиву принадлежит большее из средних
        if (averageOne == averageTwo) {
            System.out.println("\nСредние арифметические двух массивов равны");
        } else if (averageOne > averageTwo) {
            System.out.println("\nСреднее арифметическое первого массива больше среднего арифметического второго массива");
        } else {
            System.out.println("\nСреднее арифметическое второго массива больше среднего арифметического первого массива");
        }
    }
}
