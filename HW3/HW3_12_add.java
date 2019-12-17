//2) Найти среднее арифметическое элементов с нечетными номерами.

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HW3_12_add {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];

        if (n <= 0) {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            System.exit(0);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }

        double total = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                total += array[i];
                count++;
            }
        }
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Среднее арифметическое элементов с нечетными номерами: " + df.format(total / count));
    }
}

