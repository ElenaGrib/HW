//6) Проверить, различны ли все элементы массива.

import java.util.Random;
import java.util.Scanner;

public class HW3_16_add {
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

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        if (count == array.length) {
            System.out.println("\nВсе элементы массива различны");
        } else {
            System.out.println("\nНе все элементы массива различны");
        }


    }
}
