//4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//массив на экран в строку. Замените каждый элемент с нечётным индексом на
//ноль. Снова выведете массив на экран на отдельной строке.

import java.util.Random;

public class HW3_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "Массив, элементы которго с нечетными индексами равняются нулю:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}

