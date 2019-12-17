//10) Найти максимальный элемент в массиве и поменять его местами с нулевым
//элементом

import java.util.Random;
import java.util.Scanner;

public class HW3_20_add {
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

        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                array[i] = max;

            }
        }

        System.out.println("\nМаксимальный элемент массива :" + max);
        System.out.println("Новый массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
